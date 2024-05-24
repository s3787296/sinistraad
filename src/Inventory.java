import java.util.ArrayList;

public class Inventory {

    // creating player inventory arraylist
    public static ArrayList<Item> playerItemList = new ArrayList<Item>();

    // printing players inventory items
    public static void printInventory() {
        Misc.clearConsole();
        Misc.printHeading("INVENTORY");
        for (int i = 0; i < playerItemList.size(); i++) {
            Misc.printHeading("Item: "+ (i+1));
            System.out.println("Name: "+playerItemList.get(i).getName());
            System.out.println("Type: "+playerItemList.get(i).getType());
            System.out.println("Desc: "+playerItemList.get(i).getDesc());
            System.out.println("Buff: "+playerItemList.get(i).getBuff());
        }
        Misc.continueKey();
    }

    



}
