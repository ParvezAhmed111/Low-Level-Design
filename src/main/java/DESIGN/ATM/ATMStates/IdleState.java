package DESIGN.ATM.ATMStates;

import DESIGN.ATM.ATM;
import DESIGN.ATM.Card;


public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
