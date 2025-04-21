package N04;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {

        // scanner
        Scanner in = new Scanner(System.in);

        // get information from user
        System.out.print("Enter server IP: ");
        String host = in.nextLine();
        System.out.print("Enter port number: ");
        int port = in.nextInt();
        in.nextLine();

        try {
            // create socket and connect to server
            Socket socket = new Socket(host, port);
            System.out.println("Connected to chat server.");

            new Thread(new ReadHandler(socket)).start();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                String userInput = in.nextLine();
                out.println(userInput);
            }

        } catch (IOException e) {
            // error message
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
