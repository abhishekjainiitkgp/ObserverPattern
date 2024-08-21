import Observer.Observer;
import Observer.PhoneObserver;
import Observable.IphoneObservable;
import Observable.MacBookObservable;
import Observable.Observable;
import Observer.EmailObserver;

public class ObserverPattern {
    public static void main(String[] args) {
        Observable iphoneObservable= new IphoneObservable(0, "Iphone");
        Observable macbookObservable= new MacBookObservable(0, "MacBook");

        Observer phoneObserver1= new PhoneObserver(iphoneObservable, "1234567890");
        Observer emailObserver1=new EmailObserver(iphoneObservable, "abc@email.com");
        iphoneObservable.addObserver(phoneObserver1);
        iphoneObservable.addObserver(emailObserver1);
        Observer emailObserver2= new EmailObserver(macbookObservable, "abc123@email.com");
        macbookObservable.addObserver(emailObserver2);
        macbookObservable.setQuantity(10);
        iphoneObservable.setQuantity(10);
    }
}
