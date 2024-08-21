package Observer;

import Observable.Observable;

public class EmailObserver implements Observer {
    Observable observable;

    public EmailObserver(Observable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    String email;
    @Override
    public void update() {
        String msg="new Stock update for "+ observable.getItemName();
        sendEmail(msg, this.email);
    }
    public void sendEmail(String msg, String email){
        System.out.println("email sent to "+ email+ ": "+ msg);
    }
}
