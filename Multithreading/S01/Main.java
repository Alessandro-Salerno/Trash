public class Main {
    public static void main(String[] args) {
        Thread mThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello, world!");
                }
            }
        };

        Thread mThread2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello, java!");
                }
            }
        };

        mThread.start();
        mThread2.start();
    }
}
