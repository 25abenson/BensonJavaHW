import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        // parse input arguments for port
        int port = 8675;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Couldn't understand port, using default instead.");
            }

        }

        System.out.printf("port %d%n", port);

        // lets use a try-with resources statement
        try (
                ServerSocket serverSocket = new ServerSocket(port);
                Socket clientsSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientsSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientsSocket.getInputStream()));) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                // echo stuff from the client
                System.out.println("Message recieved: " + inputLine);
                out.println(inputLine);
            }

            // were done.
            System.out.println("We're done.");

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }

        System.out.println("Goodbye!");
    }
}
