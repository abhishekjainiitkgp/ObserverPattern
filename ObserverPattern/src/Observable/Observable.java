package Observable;

import Observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void notifyObsevers();
    void setQuantity(int quantity);
    int getQuantity();
    String getItemName();
}
