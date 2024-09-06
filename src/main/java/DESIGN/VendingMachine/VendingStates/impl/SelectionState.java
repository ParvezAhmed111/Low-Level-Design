package DESIGN.VendingMachine.VendingStates.impl;

import DESIGN.VendingMachine.Coin;
import DESIGN.VendingMachine.Item;
import DESIGN.VendingMachine.VendingMachine;
import DESIGN.VendingMachine.VendingStates.State;

import java.util.List;

/*
        chooseProduct(VendingMachine machine, int codeNumber)
        getChange(int returnExtraMoney)
        refundFullMoney(VendingMachine machine)

        rest throws exception
*/

public class SelectionState implements State {

    public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception{
        Item item = machine.getInventory().getItem(codeNumber);  //1. get item of this codeNumber
        int paidByUser = 0;  //2. total amount paid by User
        for(Coin coin : machine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }
        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }
        else {
            if(paidByUser > item.getPrice()) { // if user has paid more money, refund the rest
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber)); // change to dispense product statue
        }
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception{
        //actual logic should be to return COINs in the dispense tray, but for simplicity i am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    /*-------------------------------------------Throws Exception-------------------------------------------*/

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception{
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }

}
