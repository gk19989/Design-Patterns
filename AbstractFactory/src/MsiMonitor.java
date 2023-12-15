/**
 * MsiMonitor class, implementing the Monitor interface.
 *
 * Represents a concrete product in the Abstract Factory pattern for MSI brand Monitors, providing specific implementation details for MSI Monitors.
 */
public class MsiMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("MSI Monitor created!");
    }
}
