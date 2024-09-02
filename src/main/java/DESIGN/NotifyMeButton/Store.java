package DESIGN.NotifyMeButton;

import DESIGN.NotifyMeButton.Observable.IphoneObservableImpl;
import DESIGN.NotifyMeButton.Observable.StocksObservable;
import DESIGN.NotifyMeButton.Observer.EmailAlertObserverImpl;
import DESIGN.NotifyMeButton.Observer.MobileAlertObserverImpl;
import DESIGN.NotifyMeButton.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1= new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2= new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3= new MobileAlertObserverImpl("xyz_username", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
    }
}
