/**
 * AsusGpu class, implementing the Gpu interface.
 *
 * Represents a concrete product in the Abstract Factory pattern. This class provides the specific implementation of an Asus brand GPU.
 */
public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Asus GPU created!");
    }
}
