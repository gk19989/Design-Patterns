/**
 * MsiGpu class, implementing the Gpu interface.
 *
 * Represents a concrete product in the Abstract Factory pattern for MSI brand GPUs, providing specific implementation details for MSI GPUs.
 */
public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("MSI Gpu Created!");
    }
}
