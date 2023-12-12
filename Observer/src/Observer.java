/**
 * The Observer interface for the Observer design pattern.
 *
 * This interface defines a method for updating observers. Classes implementing this
 * interface will update their state in response to notifications from the Subject.
 */
public interface Observer {

    /**
     * Updates the observer with new stock prices.
     *
     * This method is called by the Subject when the stock prices change. It updates
     * the observer's state with the new prices.
     *
     * @param ibmPrice The updated price of IBM stock.
     * @param aaplPrice The updated price of AAPL stock.
     * @param googPrice The updated price of GOOG stock.
     */
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}