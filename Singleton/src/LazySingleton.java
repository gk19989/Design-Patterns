public class LazySingleton {

    /**
     * Private constructor to prevent instantiation from other classes.
     *
     * The constructor is private to ensure that no other class can directly
     * instantiate a new LazySingleton object. This is a key aspect of the
     * Singleton pattern, as it restricts the creation of the object to within
     * the class itself.
     */
    private LazySingleton() {}

    /**
     * The single instance of the class, initially null.
     *
     * This static field holds the single instance of the LazySingleton class.
     * Unlike eager initialization, it is not created when the class is loaded
     * but is initialized to null. It will be instantiated only when needed
     * for the first time, a process known as lazy initialization.
     */
    private static LazySingleton instance;

    /**
     * Public static method to access the single instance of the class.
     *
     * This method provides a global access point to the LazySingleton instance
     * and includes a mechanism to create this instance if it has not been
     * created already. This is where lazy initialization is implemented: the
     * instance is created the first time this method is invoked.
     *
     * @return the single instance of LazySingleton
     */
    public static LazySingleton getInstance() {
        // Check if the instance is null, indicating that it hasn't been created yet
        if (instance == null) {
            // If the instance is null, create a new LazySingleton object
            instance = new LazySingleton();
        }
        // Return the instance (newly created or existing)
        return instance;
    }
}
