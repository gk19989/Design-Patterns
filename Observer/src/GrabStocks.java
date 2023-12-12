/**
 * The GrabStocks class demonstrates the use of the Observer pattern with stock prices.
 *
 * This class serves as the entry point to demonstrate how observers (StockObserver)
 * react to changes in the subject (StockGrabberSubject). It simulates real-time updates
 * of stock prices for different stocks and showcases the dynamic registration and
 * unregistration of observers.
 */
public class GrabStocks {
    public static void main(String[] args) {

        // Creating a subject for the stock prices
        StockGrabberSubject stockGrabberSubject = new StockGrabberSubject();

        // Creating and registering the first observer
        StockObserver observer1 = new StockObserver(stockGrabberSubject);

        // Setting initial stock prices and notifying observers
        stockGrabberSubject.setAaplPrice(123.90);
        stockGrabberSubject.setGoogPrice(312.09);
        stockGrabberSubject.setIbmPrice(321.99);

        // Creating and registering a second observer
        StockObserver observer2 = new StockObserver(stockGrabberSubject);

        // Updating stock prices and notifying observers
        stockGrabberSubject.setAaplPrice(890.21);
        stockGrabberSubject.setGoogPrice(908.12);
        stockGrabberSubject.setIbmPrice(980.11);

        // Unregistering the first observer
        stockGrabberSubject.unregister(observer1);

        // Updating stock prices again; only the second observer gets notified
        stockGrabberSubject.setAaplPrice(123.90);
        stockGrabberSubject.setGoogPrice(312.09);
        stockGrabberSubject.setIbmPrice(321.99);

    }
}
