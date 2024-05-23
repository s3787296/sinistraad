import java.util.ArrayList;

public class Inventory {

    // creating player inventory arraylist
    public static ArrayList<Item> playerItemList = new ArrayList<Item>();

    // printing players inventory items
    public static void printInventory() {
        Misc.clearConsole();
        Misc.printHeading("Inventory");
        for (int i = 0; i < playerItemList.size(); i++) {
            System.out.println(playerItemList.get(i).toString());
        }
        Misc.continueKey();
    }

    // helper method to check if the players inventory contains input item
    public static boolean containsItem(String item) {
        boolean contains = false;
        for (int i = 0; i < playerItemList.size(); i++) {
            if (item.equalsIgnoreCase(playerItemList.get(i).getName())) {
                contains = true;
            }
        }
        return contains;
    }

    // method to add the hero sword item to players inventory
    public static void herosSword() {
        playerItemList.add(new Item("Hero's Sword", "Weapon", "TBC", "+10 Attack"));
        while (containsItem("Hero's Sword") == true) {
            Player.weaponAtk = 10;
        }
    }

    // method to add the wolfhide armour item to players inventory
    public static void wolfhideArmour() {
        playerItemList.add(new Item("Wolfhide Armour", "Armour", "TBC", "+20 Defence"));
        while (containsItem("Wolfhide Armour") == true) {
            Player.armourDef = 20;
        }
    }

    // method to add the heros map item to players inventory
    public static void herosMap() {
        playerItemList.add(new Item("Hero's Map", "Quest", "TBC", "Forest Access"));
        while (containsItem("Hero's Map") == true) {
            // mapAccessKey = true;
            // variable to allow forest access in other classes
        }
    }

    // method to add the matriarch's blood item to players inventory
    public static void matriarchsBlood() {
        playerItemList.add(new Item("Matriarch's Blood", "Bonus", "TBC", "+10 Attack"));
        while (containsItem("Matriarch's Blood") == true) {
            Player.bonusAtk = 10;
        }
    }

    // method to add the chamber key item to the players inventory
    public static void chamberKey() {
        playerItemList.add(new Item("Chamber Key", "Quest", "TBC", "Chamber Access"));
        while (containsItem("Chamber Key") == true) {
            // chamberAccessKey = true;
            // variable to allow chamber access in other classes
        }
    }

    // method to add the gate key item to the players inventory
    public static void gateKey() {
        playerItemList.add(new Item("Gate Key", "Quest", "TBC", "Gate Access"));
        while (containsItem("Gate Key") == true) {
            // gateAccessKey = true;
            // variable to allow chamber access in other classes
        }
    }

    // method to add the maidens blessing to the players inventory
    public static void maidensBlessing() {
        playerItemList.add(new Item("Maiden's Blessing", "Bonus", "TBC", "+10 Defence"));
        while (containsItem("Maiden's Blessing") == true) {
            Player.bonusDef = 10;
        }
    }

    // method to add the archaic goblet to the players inventory
    public static void archaicGoblet() {
        playerItemList.add(new Item("Archaic Goblet", "Bonus", "TBC", "Null"));
        while (containsItem("Archaic Goblet") == true) {
            // holdingGoblet = true;
        }
    }

    // method to add the forgemasters greatsword to the players inventory
    public static void forgemastersGreatsword() {
        playerItemList.add(new Item("Forgemaster's Greatsword", "Weapon", "TBC", "+50 Attack"));
        while (containsItem("Forgemaster's Greatsword") == true) {
            Player.weaponAtk = 50;
        }
    }

}
