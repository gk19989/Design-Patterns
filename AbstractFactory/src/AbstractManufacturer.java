/**
 * AbstractManufacturer class.
 *
 * Acts as the abstract factory in the Abstract Factory pattern. This class declares methods to create abstract products, Gpu and Monitor, allowing subclasses to define the creation of specific products.
 */
public abstract class AbstractManufacturer {
    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
