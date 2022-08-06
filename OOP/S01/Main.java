public class Main {
    public static void fullTest(InterfaceTest t) {
        t.test();
        t.test2();
    }

    public static void main(String[] args) {
        // Using Anonymous class with Abstract Class
        // CAN override methods
        // CAN also inherit from abstract class
        Main.fullTest(new AbstractTest() {
            @Override
            public void test() {
                System.out.println("My Abstract Test");
            }
        });

        // Using Anonymous class with interface
        // MUST implement all methods (No default implementation provided)
        // NO inheritance
        // Can be used as lambda functions if there's only one method
        Main.fullTest(new InterfaceTest() {
            @Override
            public void test() {
                System.out.println("My Interface Test");
            }

            @Override
            public void test2() {
                System.out.println("My Second Interface Test");
            }
        });
    }
}
