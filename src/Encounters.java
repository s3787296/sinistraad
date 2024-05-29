public class Encounters {

    // Checking if the player location matches a non-combat player encounter
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

    // Method to run the encounter with Old Remraf, the farmer at the Tilled Plains.
    private static void farmerEncounter(){
        // If player bag contains Matriarch's Blood, call relevant story method
        if (Misc.containsItem("Matriarch's Blood")) {
            System.out.println(Story.farmerReturnStory());
            if (!Misc.containsItem("Hero's Map")) {
                // If player bag doesn't already contain the Hero's Map, give it to player
                Game.player.getPlayerItems().add(ItemList.herosMap()); 
            }
         } else {}
            // If bag doesn't contain Matriarch's Blood, call relevant story method
            System.out.println(Story.farmerStory());
    }

    // Method to let player make a purchase when they are within the apothecaryEncounter() method
    private static void apothecaryPurchase(int gold, Item item) {
        int option = Misc.readInt();
        if (option == 1) {
            // If player selects "[1] Accept"
            if (Game.player.getGold() >= gold) {
                // If player has exactly or more than the amount of gold the item costs, add the healing potion to their bag
                System.out.println("\nA most splendid choice, dear friend. Do stop by again, won't you?");
                Game.player.getPlayerPotions().add(item);
                // Take the appropriate amount of gold from player's gold
                Game.player.setGold(Game.player.getGold() - gold);
                Misc.continueKey();
            } else {
                // Print failure message
                System.out.println(
                        "\nOh, how unfortunate - it seems you do not have the coin to match... Perhaps another time.");
                Misc.continueKey();
            }
        } else if (option == 2) {
            // If player selects "[2] Decline"
            System.out.println("\nOh... Very well... Make sure to stop by again!");
            Misc.continueKey();
        }
    }

    private static void apothecaryEncounter() {
        boolean purchase = true;
        while (purchase) {
            Story.nostramusStartStory();
            Misc.continueKey();
            Misc.clearConsole();
            Misc.printHeading("APOTHECARY");
            System.out.println("NOSTRAMUS: Well hello there, weary traveller! Welcome to my apothecary. We aim to heal all things - well, all things except a broken heart. There are some things a potion just can't fix.");
            System.out.println("See anything you like?");
            // If player has any of the Goblet items, display the following menu
            if (Misc.containsItem("Empty Goblet") || Misc.containsItem("Filled Goblet") || Misc.containsItem("Blessed Goblet")) {
                System.out.println("[1] Healing Potion" + "\n[2] Exit");
                int input = Misc.readInt();
                if (input == 1) {
                    // Menu option selected: [1] Healing Potion
                    System.out.println("\nAh yes, these are my specialty and a favourite of travellers such as yourself.\nThat'll be 10g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    // Call the purchase method
                    apothecaryPurchase(10, ItemList.healingPotion());
                }
                if (input == 2) {
                    // Menu option selected: [2] Exit
                    purchase = false;
                    return;
                }
            } else {
                // If the player doesn't have any goblets, display the following menu
                System.out.println("[1] Healing Potion" + "\n[2] Empty Goblet" + "\n[3] Exit");
                int input = Misc.readInt();
                if (input == 1) {
                    // Menu option selected: [1] Healing Potion
                    System.out.println("\nAh yes, these are my specialty and a favourite of travellers such as yourself.\nThat'll be 10g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(10, ItemList.healingPotion());
                }
                if (input == 2) {
                    // Menu option selected: [2] Empty Goblet
                    System.out.println( "\nOh, this old thing? Well... I suppose I could give it to you - for a price.\nI think 30g is fair.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(30, ItemList.emptyGoblet()); 
                    Story.nostramusGobletStory();
                }
                if (input == 3) {
                    // Menu option selected: [3] Exit
                    purchase = false;
                    break;
                }
            }
        }
    }
    
    // Method for player encounter to fill the Empty Goblet with the Lost Maiden's tears
    private static void maidenTearsEncounter() {
        // If player bag contains Empty Goblet item, call appropriate story method
        if (Misc.containsItem("Empty Goblet")) {
            System.out.println(Story.tearsSucceedStory());
            Misc.continueKey();
            // Remove the Empty Goblet from player's bag and add a Filled Goblet
            Game.player.getPlayerItems().remove(ItemList.emptyGoblet());
            Game.player.getPlayerItems().add(ItemList.filledGoblet());
         } else {
            // If player bag does not contain Empty Goblet item, call appropriate story method
            System.out.println(Story.tearsFailStory());
            Misc.continueKey();
         }
    }

    // Method for player encounter to receive Cathedral Key after Forgemaster Fuego battle
    private static void cathedralKeyEncounter() {
        // If player bag contains Forgemaster's Greatsword, add a Cathedral Key to player bag
        if (Misc.containsItem("Forgemaster's Greatsword")) {
            Game.player.getPlayerItems().add(ItemList.cathedralKey());
            System.out.println("You take the key from Forgemaster Fuego's belt.\n You can now unlock the door to the Cathedral."); // TODO Description glowup
            Misc.continueKey();
        }
    }

    // Method for player encounter to enchant the filled goblet at the altar in the cathedral
    private static void altarEncounter() {
        // If player bag contains Filled Goblet, call appropriate story method
        if (Misc.containsItem("Filled Goblet")) {
            System.out.println(Story.altarSuccessStory());
            Misc.continueKey();
            // Remove Filled Goblet from player's bag and add a Blessed Goblet
            Game.player.getPlayerItems().remove(ItemList.filledGoblet());
            Game.player.getPlayerItems().add(ItemList.blessedGoblet());
        } else {
            // If player bag does not contain Filled Goblet, call appropriate story method
            System.out.println(Story.altarFailStory());
            Misc.continueKey();
        }
    }

    private static void eripmavEncounter() {
        // TODO Eripmav Encounter
    }
}
