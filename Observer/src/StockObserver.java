/**
 * A concrete implementation of the Observer interface for stock price updates.
 *
 * This class observes changes in stock prices and updates its state accordingly. It
 * maintains a reference to the Subject and automatically registers itself as an observer.
 */
public class StockObserver implements Observer {

    private double ibmPrice; // Current IBM stock price
    private double aaplPrice; // Current AAPL stock price
    private double googPrice; // Current GOOG stock price

    private static int observerIDTracker = 0; // Tracker for the observer ID

    private int observerID; // Unique ID for this observer

    private Subject stockGrabber; // Reference to the Subject

    /**
     * Constructor for StockObserver.
     *
     * Registers itself as an observer to the provided Subject and initializes the observer ID.
     *
     * @param stockGrabber The Subject to observe.
     */
    public StockObserver(Subject stockGrabber){

        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        this.ibmPrice = ibmPrice;
        printPrices();
    }

    /**
     * Prints the latest stock prices.
     *
     * This method is called after the observer's state is updated with new stock prices.
     */
    public void printPrices(){
        System.out.println(observerID + "\nIBM: "+ibmPrice+"\nAAPL: "+aaplPrice+"\nGOOG: "+googPrice+"\n");
    }
}