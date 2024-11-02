package DESIGN.ATM;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    Card card;
    UserBankAccount bankAccount;

//    public Card getCard() {
//        return card;
//    }
//
//    public void setCard(Card card) {
//        this.card = card;
//    }
}
