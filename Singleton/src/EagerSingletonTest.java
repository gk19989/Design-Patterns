public class EagerSingletonTest {

    /**
     * The main method for testing the EagerSingleton class.
     *
     * This method serves as the entry point for the application. It is used to
     * demonstrate the usage of the EagerSingleton class and to verify that it
     * indeed follows the singleton pattern by comparing the hash codes of two
     * obtained instances.
     */
    public static void main(String args[]) {
        // Print a greeting message to the console
        System.out.println("Hello World!");

        // Obtain the first instance of EagerSingleton
        EagerSingleton obj1 = EagerSingleton.getInstance();

        // Print the hash code of the first instance
        System.out.println(obj1.hashCode());

        // Obtain the second instance of EagerSingleton
        EagerSingleton obj2 = EagerSingleton.getInstance();

        // Print the hash code of the second instance
        System.out.println(obj2.hashCode());
    }
}
