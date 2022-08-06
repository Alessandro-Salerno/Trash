public class Server {
    public static void main(String[] args) {
        TCPServer myServer = new TCPServer();
        myServer.listen();
    }
}
