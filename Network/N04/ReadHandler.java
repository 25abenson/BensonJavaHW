package N04;

import java.io.*;
import java.net.*;

public class ReadHandler implements Runnable {
    private BufferedReader in;

    public ReadHandler(Socket socket) {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.out.println("Exception: Error with setting up the input stream");
        }
    }

    public void run() {
        String serverMessage;
        try {
            while ((serverMessage = in.readLine()) != null) {
                System.out.println(serverMessage);
            }
        } catch (IOException e) {
            // error message
            System.out.println("You are disconnected from the server.");
        }
    }
}
