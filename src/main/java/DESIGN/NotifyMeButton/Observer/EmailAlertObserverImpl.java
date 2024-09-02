package DESIGN.NotifyMeButton.Observer;

import DESIGN.NotifyMeButton.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId= emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sentMail(emailId, "product in in stock, hurry up!");

    }

    private void sentMail(String emailId, String msg){
        // sent the actual email to the end user
        System.out.println("mail sent to : " + emailId);
    }
}
