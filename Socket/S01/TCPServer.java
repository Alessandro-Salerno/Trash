import java.io.*;
import java.net.*;


public class TCPServer {
    /*
     * Port number for the server
     */
    private final int _serverPort;

    /*
     * TCPServer constructor
     * @param port The server's port number
     */
    public TCPServer(int port) {
        _serverPort = port;
    }

    /*
     * Base TCPServer constructor
     */
    public TCPServer() {
        this(8000);
    }


    /*
     * Start listening for connections
     */
    public void listen() {
        // Start server
        try (ServerSocket serverSocket = new ServerSocket(_serverPort)) {
            System.out.println("Server is listening on port " + _serverPort);

            // Listen forever
            while (true) {
                // Listen for new connections
                Socket socket = serverSocket.accept();
                System.out.println("New client " + socket.toString());

                // Get stream instance and write "Hello client" to the client
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("Hello client!");

                // Close connection
                socket.close();
            }
        }

        // If an IOException is thrown
        catch (java.io.IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }


    /*
     * Getter for the server port
     */
    public int getPort() { return _serverPort; }
}
