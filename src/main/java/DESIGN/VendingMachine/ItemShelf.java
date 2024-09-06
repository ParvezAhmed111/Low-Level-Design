package DESIGN.VendingMachine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;
}
