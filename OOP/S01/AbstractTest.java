public class AbstractTest implements InterfaceTest {
    @Override
    public void test() {
        System.out.println("Default out!");
    }

    @Override
    public void test2() {
        System.out.println("Default Test2");
    }
}
