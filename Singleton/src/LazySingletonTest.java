public class LazySingletonTest {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        LazySingleton obj1 = LazySingleton.getInstance();
        System.out.println(obj1.hashCode());

        LazySingleton obj2 = LazySingleton.getInstance();
        System.out.println(obj2.hashCode());

    }
}
