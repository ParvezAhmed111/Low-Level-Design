package DESIGN.NotifyMeButton.Observer;

import DESIGN.NotifyMeButton.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.userName = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sentMsgOnMobileMail(userName, "product in in stock, hurry up!");

    }

    private void sentMsgOnMobileMail(String emailId, String msg){
        // sent the actual email to the end user
        System.out.println("mail sent to : " + emailId);
    }
}
