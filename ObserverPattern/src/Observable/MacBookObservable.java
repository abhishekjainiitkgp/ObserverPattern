package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MacBookObservable implements Observable{
    int quantity;
    String item;
    List<Observer> observerList=new ArrayList<>();

    public MacBookObservable(int quantity, String item) {
        this.quantity = quantity;
        this.item=item;
        this.observerList= new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void notifyObsevers() {
        for(Observer observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setQuantity(int quantityAddition) {
        if(quantity==0){
            notifyObsevers();
        }
        quantity+=quantityAddition;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getItemName() {
        return item;
    }
}
