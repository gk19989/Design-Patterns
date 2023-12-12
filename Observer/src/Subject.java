/**
 * The Subject interface for the Observer design pattern.
 *
 * This interface declares methods for attaching, detaching, and notifying observers.
 * Classes implementing this interface will maintain a list of observers and notify them
 * of any state changes.
 */
public interface Subject {

    /**
     * Registers an observer.
     *
     * This method adds a new observer to the list of observers. The observer will be
     * notified of any changes in the Subject's state.
     *
     * @param observer The observer to be registered.
     */
    public void register(Observer observer);

    /**
     * Unregisters an observer.
     *
     * This method removes an observer from the list of observers. The observer will
     * no longer receive state updates from the Subject.
     *
     * @param observer The observer to be unregistered.
     */
    public void unregister(Observer observer);

    /**
     * Notifies all registered observers.
     *
     * This method is called to notify all the observers when the Subject's state changes.
     */
    public void notifyObserver();
}