/**
 * MsiManufacturer class, extending the AbstractManufacturer class.
 *
 * Serves as another concrete factory within the Abstract Factory pattern. This class is responsible for creating MSI-specific products, namely MSI GPUs and Monitors.
 */
public class MsiManufacturer extends AbstractManufacturer {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
