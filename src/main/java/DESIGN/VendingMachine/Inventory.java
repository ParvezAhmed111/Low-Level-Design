package DESIGN.VendingMachine;

public class Inventory {

    ItemShelf[] itemsInSelves;

    Inventory(int itemCount) {
        itemsInSelves = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    //getter
    public ItemShelf[] getItemsInSelves() {
        return itemsInSelves;
    }
    //setter
    public void setItemsInSelves(ItemShelf[] itemsInSelves) {
        this.itemsInSelves = itemsInSelves;
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < itemsInSelves.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            itemsInSelves[i]= space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for (ItemShelf itemShelf : itemsInSelves) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.item = item;
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {

        for (ItemShelf itemShelf : itemsInSelves) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf : itemsInSelves) {
            if (itemShelf.code == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
