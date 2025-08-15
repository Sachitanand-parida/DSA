package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable= observable;
    }

    @Override
    public void update() {
        sendMessage(userName, "Product is in stock, hurry up !!!!");
    }

    private void sendMessage(String userName, String s) {
        System.out.println("Message sent to: "+ userName);
    }
}
