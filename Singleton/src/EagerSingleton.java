public class EagerSingleton {

    /**
     * Private constructor to prevent instantiation from other classes.
     *
     * The constructor is private to ensure that no other class can create a new
     * instance of this class. This is essential to the Singleton pattern, as
     * it guarantees that only one instance of the class can ever exist within
     * the application.
     */
    private EagerSingleton() {}

    /**
     * The single instance of the class.
     *
     * This is a private static final field that holds the single instance of
     * the EagerSingleton class. It is initialized when the class is loaded
     * into the memory. This is referred to as eager initialization because
     * the instance is created at the time of class loading, regardless of
     * whether or not it is currently needed in the execution flow.
     */
    private static final EagerSingleton instance = new EagerSingleton();

    /**
     * Public method to access the single instance of the class.
     *
     * This method provides a global point of access to the EagerSingleton
     * instance. Since the instance field is private, this method is the only
     * way for other classes to access the singleton instance. It ensures that
     * the same instance is returned every time it is called.
     *
     * @return the single instance of EagerSingleton
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
