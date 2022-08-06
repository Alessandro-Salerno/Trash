public class Main {
    public static void fullTest(InterfaceTest t) {
        t.test();
        t.test2();
    }

    public static void main(String[] args) {
        Main.fullTest(new AbstractTest() {
            @Override
            public void test() {
                System.out.println("My Abstract Test");
            }
        });

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
