/**
 * This class handles the methods relating to non-combat player encounters.
 * @author Max
 * @author Jude
 */
public class Encounters {

    /**
     * Checking if the player location matches a non-combat player encounter.
     * @param   location
     */
    public static void playerEncounters(Location location){
        if (location.equals(LocationList.cList.get(2))) {
            apothecaryEncounter();
        } else if (location.equals(LocationList.eList.get(4))) {
            farmerEncounter();
        } else if (location.equals(LocationList.dList.get(2))) {
            maidenTearsEncounter();
        } else if (location.equals(LocationList.aList.get(1))) {
            cathedralKeyEncounter();
        } else if (location.equals(LocationList.cList.get(1))) {
            altarEncounter();
        } else if (location.equals(LocationList.eList.get(1))) {
            eripmavEncounter();
        }
    }

    /**
     * Method to run the encounter with Old Remraf, the farmer at the Tilled Plains.
     */
    private static void farmerEncounter(){
        // If player bag contains Matriarch's Blood, call relevant story method
        if (Misc.containsItem("Matriarch's Blood")) {
            Misc.printHeading(Story.farmerReturnStory());
            // if player bag does not contain Hero's Map, add Hero's Map
            if (!Misc.containsItem("Hero's Map")) {
                Game.player.getPlayerItems().add(ItemList.herosMap());
            }
            // If bag doesn't contain Matriarch's Blood, call relevant story method
        } else if (!Misc.containsItem("Matriarch's Blood")) {
            Misc.printHeading(Story.farmerStory());
            // if player bag does not contain heros sword, add heros sword
            if (!Misc.containsItem("Hero's Sword")) {
                Game.player.getPlayerItems().add(ItemList.herosSword());
            }
        }
    }

    /**
     * Method to let player make a purchase when they are within the {@code apothecaryEncounter()} method
     * @param   gold
     * @param   item
     */
    private static void apothecaryPurchase(int gold, Item item) {
        int option = Misc.readInt();
        // If player selects "[1] Accept"
        if (option == 1) {
            // If player has exactly or more than the amount of gold the item costs, add the
            // healing potion to their bag
            if (Game.player.getGold() >= gold) {
                System.out.println("\nA most splendid choice, dear friend. Do stop by again, won't you?");
                // Add Empty Goblet to player inventory
                if (item == ItemList.emptyGoblet()) {
                    Game.player.getPlayerItems().add(item);
                    // Add Healing Potion to player potion list
                } else if (item == ItemList.healingPotion()) {
                    Game.player.getPlayerPotions().add(item);
                }
                // Take the appropriate amount of gold from player's gold
                Game.player.setGold(Game.player.getGold() - gold);
                Misc.continueKey();
                // If player does not have enough gold, print failure message
            } else {
                System.out.println(
                        "\nOh, how unfortunate - it seems you do not have the coin to match... Perhaps another time.");
                Misc.continueKey();
            }
            // If player selects "[2] Decline"
        } else if (option == 2) {
            System.out.println("\nOh... Very well... Make sure to stop by again!");
            Misc.continueKey();
        }
    }

    /**
     * Method to start the encounter with Nostramus at the Apothecary
     * @param   purchase      Whether player is making a purchase or not.
     */
    private static void apothecaryEncounter() {
        boolean purchase = true;
        while (purchase) {
            Misc.printHeading(Story.nostramusStartStory());
            Misc.continueKey();
            Misc.clearConsole();
            Misc.printHeading("APOTHECARY"); // TODO Add to the location story? Well hello there, weary traveller! We
                                             // aim to heal all things - well, all things except a broken heart. There
                                             // are some things a potion just can't fix.
            System.out.println("NOSTRAMUS: Welcome to my apothecary.");
            System.out.println("See anything you like?");
            // If player has any of the Goblet items, display the following menu
            if (Misc.containsItem("Empty Goblet") || Misc.containsItem("Filled Goblet")
                    || Misc.containsItem("Blessed Goblet")) {
                System.out.println("[1] Healing Potion" + "\n[2] Exit");
                int input = Misc.readInt();
                // Menu option selected: [1] Healing Potion
                if (input == 1) {
                    System.out.println("\nAh yes, these are my specialty and a favourite of travellers such as yourself.\nThat'll be 10g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    // Call the purchase method
                    apothecaryPurchase(10, ItemList.healingPotion());
                }
                // Menu option selected: [2] Exit
                if (input == 2) {
                    purchase = false;
                    return;
                }
            } else {
                // If the player doesn't have any goblets, display the following menu
                System.out.println("[1] Healing Potion" + "\n[2] Empty Goblet" + "\n[3] Exit");
                int input = Misc.readInt();
                // Menu option selected: [1] Healing Potion
                if (input == 1) {
                    System.out.println("\nAh yes, these are my specialty and a favourite of travellers such as yourself.\nThat'll be 10g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(10, ItemList.healingPotion());
                }
                // Menu option selected: [2] Empty Goblet
                if (input == 2) {
                    System.out.println( "\nOh, this old thing? Well... I suppose I could give it to you - for a price.\nI think 30g is fair.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(30, ItemList.emptyGoblet());
                    Misc.printHeading(Story.nostramusGobletStory());
                }
                // Menu option selected: [3] Exit
                if (input == 3) {
                    purchase = false;
                    break;
                }
            }
        }
    }
    
    /**
     * Method for player encounter to fill the Empty Goblet with the Lost Maiden's tears
     */
    private static void maidenTearsEncounter() {
        // If player bag contains Empty Goblet item, call appropriate story method
        if (Misc.containsItem("Empty Goblet")) {
            Misc.printHeading(Story.tearsSucceedStory());
            Misc.continueKey();
            // Remove the Empty Goblet from player's bag and add a Filled Goblet
            Game.player.getPlayerItems().remove(ItemList.emptyGoblet());
            Game.player.getPlayerItems().add(ItemList.filledGoblet());
        } else {
            // If player bag does not contain Empty Goblet item, call appropriate story
            // method
            Misc.printHeading(Story.tearsFailStory());
            Misc.continueKey();
         }
    }

    /**
     * Method for player encounter to receive Cathedral Key after Forgemaster Fuego battle
     */
    private static void cathedralKeyEncounter() {
        // If player bag contains Forgemaster's Greatsword, add a Cathedral Key to player bag
        if (Misc.containsItem("Forgemaster's Greatsword")) {
            Game.player.getPlayerItems().add(ItemList.cathedralKey());
            System.out.println("You take the key from Forgemaster Fuego's belt.\n You can now unlock the door to the Cathedral."); // TODO Description glowup
            Misc.continueKey();
        }
    }

    /**
     * Method for player encounter to enchant the filled goblet at the altar in the cathedral
     */
    private static void altarEncounter() {
        // If player bag contains Filled Goblet, call appropriate story method
        if (Misc.containsItem("Filled Goblet")) {
            Misc.printHeading(Story.altarSuccessStory());
            Misc.continueKey();
            // Remove Filled Goblet from player's bag and add a Blessed Goblet
            Game.player.getPlayerItems().remove(ItemList.filledGoblet());
            Game.player.getPlayerItems().add(ItemList.blessedGoblet());
        } else {
            // If player bag does not contain Filled Goblet, call appropriate story method
            Misc.printHeading(Story.altarFailStory());
            Misc.continueKey();
        }
    }

    /**
     * Method for player encounter after they have battled Count Eripmav
     */
    private static void eripmavEncounter() {
        if (Game.player.getCurrentLocation().getEnemy().getCurHp() <= 0) {
            if (Misc.containsItem("Blessed Goblet")) {
                Misc.printHeading(Story.greatEndingStory());
            } else {
                Misc.printHeading(Story.goodEndingStory());
            }
        }
    }
}
