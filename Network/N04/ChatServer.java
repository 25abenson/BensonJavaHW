package N04;

import java.io.*;
import java.net.*;
import java.util.*;

class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String name;

    // constructor
    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    // return name method
    public String returnName() {
        return name;
    }

    // send message method
    public void sendOutMessage(String message) {
        out.println(message);
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // get information from clients
            out.println("Enter your name: ");
            name = in.readLine();
            System.out.println(name + " has joined the chat sever.");
            ChatServer.broadcast(name + " has joined the chat server.", this);

            // broadcast user information
            String message;
            while ((message = in.readLine()) != null) {
                ChatServer.broadcast(name + ": " + message, this);
            }
        } catch (IOException e) {
            // display error message
            System.out.println("Error has occurred with client " + name);
        } finally {
            try {
                if (socket != null)
                    socket.close();
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch (IOException e) {
                System.out.println("Error closing resources for client " + name);
            }
            // remove client
            ChatServer.removeClient(this);
        }
    }
}

public class ChatServer {

    // create list to hold clients
    private static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        // instantiate scanner
        Scanner scanner = new Scanner(System.in);

        // get port number from user
        System.out.print("Enter port number in order to host server: ");
        int port = scanner.nextInt();

        // try starting server socket and port
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Chat server started on port: " + port);

            while (true) {
                // loop to accept clients
                Socket socket = serverSocket.accept();
                System.out.println("New client has connected.");

                ClientHandler handler = new ClientHandler(socket);
                clients.add(handler);
                new Thread(handler).start();
            }
        } catch (IOException e) {
            // print exception message
            System.out.println("Server error: " + e.getMessage());
        }
    }

    public static void broadcast(String message, ClientHandler sender) {
        synchronized (clients) {
            // send message out to clients
            for (ClientHandler client : clients) {
                if (client != sender) {
                    client.sendOutMessage(message);
                }
            }
        }
    }

    // method to remove clients
    public static void removeClient(ClientHandler client) {
        clients.remove(client);
        System.out.println("Client " + client.returnName() + " disconnected.");
    }
}
