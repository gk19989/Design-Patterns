import java.util.ArrayList;

/**
 * A concrete implementation of the Subject interface for stock price updates.
 *
 * This class maintains a list of observers that are interested in stock price updates.
 * It notifies these observers whenever the prices of IBM, AAPL, or GOOG stocks change.
 */
public class StockGrabberSubject implements Subject {

    private ArrayList<Observer> observers; // List of observers
    private double ibmPrice; // Current IBM stock price
    private double aaplPrice; // Current AAPL stock price
    private double googPrice; // Current GOOG stock price

    /**
     * Constructor for StockGrabberSubject.
     *
     * Initializes the list of observers.
     */
    public StockGrabberSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Deleted observer: "+(observerIndex+1));
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    /**
     * Updates and notifies observers of the IBM stock price change.
     *
     * @param newIbmPrice The new price of IBM stock.
     */
    public void setIbmPrice(double newIbmPrice){
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    /**
     * Updates and notifies observers of the GOOG stock price change.
     *
     * @param newGoogPrice The new price of GOOG stock.
     */
    public void setGoogPrice(double newGoogPrice){
        this.googPrice = newGoogPrice;
        notifyObserver();
    }

    /**
     * Updates and notifies observers of the AAPL stock price change.
     *
     * @param newAaplPrice The new price of AAPL stock.
     */
    public void setAaplPrice(double newAaplPrice){
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }
}