/**
 * AsusMonitor class, implementing the Monitor interface.
 *
 * Represents another concrete product in the Abstract Factory pattern. This class provides the specific implementation of an Asus brand Monitor.
 */
public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Asus Monitor created!");
    }
}
