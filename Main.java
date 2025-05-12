import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int port = 10000;

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server listening on port " + port);

        while (true) {
            handleClient(serverSocket);
        }
    }

    private static void handleClient(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        System.out.println("Connection accepted from " + clientSocket.getInetAddress());

        String line;
        while ((line = in.readLine()) != null) {
            if (line.equalsIgnoreCase("bye")) {
                out.println("bye");
                break;
            }

            int wordCount = WordCounter.countWords(line);
            out.println("Word count: " + wordCount);
            out.flush();
        }
    }
}