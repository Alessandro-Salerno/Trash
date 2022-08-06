public class Main {
    public static void testLambda(LambdaInterface l) {
        l.lambdaFunction();
    }

    public static void main(String[] args) {
        Main.testLambda(() -> {
            System.out.println("First line");
            System.out.println("Second line");
        });
    }
}
