public class Client {
    public static void main(String[] args) {
        TCPClient myClient = new TCPClient("", 8000);
        myClient.connect();
    }
}
