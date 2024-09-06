package DESIGN.VendingMachine;


import DESIGN.VendingMachine.VendingStates.State;
import DESIGN.VendingMachine.VendingStates.impl.IdleState;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }
}
