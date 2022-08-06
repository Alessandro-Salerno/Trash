/*
 * Class that takes a Generic Type T
 */
public class GenericTest<T> {
    /*
     * The object itself
     */
    private T _object;

    /*
     * Constructor
     * @param obj The object
     */
    public GenericTest(T obj) {
        setObject(obj);
    }

    /*
     * Base constructor
     */
    public GenericTest() {
        this(null);
    }

    /*
     * Getter for the object
     */
    public T getObject() { return _object; }
    /*
     * Setter for the object
     */
    public void setObject(T obj) { _object = obj; }
}
