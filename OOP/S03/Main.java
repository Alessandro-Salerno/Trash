public class Main {
    public static void main(String[] args) {
        // Primitive types are not supported
        GenericTest<String> genericString = new GenericTest<>("Hello");
        GenericTest<Integer> genericInt = new GenericTest<>(1);

        System.out.println(genericString.getObject());
        System.out.println(genericInt.getObject());
    }
}
