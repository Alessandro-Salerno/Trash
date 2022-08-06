import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class TCPClient {
    /*
     * Target address
     */
    private final String _targetHost;
    /*
     * Target port
     */
    private final int _targetPort;

    /*
     * TCPClient constructor
     * @param host The target host address
     * @param port The target host port
     */
    public TCPClient(String host, int port) {
        _targetHost = host;
        _targetPort = port;
    }

    /*
     * Start a connection to the host
     */
    public void connect() {
        // Open connection
        try (Socket socket = new Socket(_targetHost, _targetPort)) {
            // Create input stream and reader
            InputStream input        = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);

            // Read the message from the server
            int chr;
            StringBuilder data = new StringBuilder();
            while ((chr = reader.read()) != -1) {
                data.append((char)chr);
            }

            // Prin the message received from the server
            System.out.println("Server message: " + data);
        }

        // If the host is not found
        catch (java.net.UnknownHostException e) {
            System.out.println("No such host " + _targetHost);
        }

        // If an error occurs
        catch (java.io.IOException e) {
            System.out.println("Client Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /*
     * Getter for the target host
     */
    public String getHost() { return _targetHost; }
    /*
     * Getter for the target port
     */
    public int getPort() { return _targetPort; }
}
