/**
 * AbstractManufacturerTest class.
 *
 * This class demonstrates the use of the Abstract Factory Design Pattern. It creates instances of concrete factories (AsusManufacturer and MsiManufacturer) and uses them to create and assemble specific products.
 */
public class AbstractManufacturerTest {
    public static void main(String[] args) {
        AbstractManufacturer msiManufacturer = new MsiManufacturer();
        msiManufacturer.createMonitor().assemble();
        msiManufacturer.createGpu().assemble();

        AbstractManufacturer asusManufacturer = new AsusManufacturer();
        asusManufacturer.createMonitor().assemble();
        asusManufacturer.createGpu().assemble();

    }
}
