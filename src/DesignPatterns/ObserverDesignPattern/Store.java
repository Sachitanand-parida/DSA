package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverDesignPattern.Observable.StocksObservable;
import DesignPatterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import DesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1= new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2= new MobileAlertObserverImpl("sachit", iphoneStockObservable);
        NotificationAlertObserver observer3= new EmailAlertObserverImpl("gsg@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
