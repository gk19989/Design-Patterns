/**
 * AsusManufacturer class, extending the AbstractManufacturer class.
 *
 * Represents a concrete factory in the Abstract Factory pattern. This class is responsible for creating Asus-specific products, namely Asus GPUs and Monitors.
 */
public class AsusManufacturer extends AbstractManufacturer {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
