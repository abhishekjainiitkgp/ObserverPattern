package Observer;

import Observable.Observable;

public class PhoneObserver implements Observer {
    Observable observable;
    String phoneNumber;
    @Override
    public void update() {
        String msg="new Stock update for "+ observable.getItemName();
        sendMessage(msg, this.phoneNumber);
    }
    void sendMessage(String msg, String phoneNumber){
        System.out.println("message sent to "+ phoneNumber+ ": "+ msg);
    }

    public PhoneObserver(Observable observable, String phoneNumber) {
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }
}
