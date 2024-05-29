public class Encounters {

    // Checking if the player location matches a non-combat player encounter
    public static void playerEncounters(Location location){
        if (location.equals(LocationList.cList.get(2))) {
            apothecaryEncounter();
        } else if (location.equals(LocationList.eList.get(4))) {
            farmerEncounter();
        } else if (location.equals(LocationList.dList.get(2))) {
            maidenTearsEncounter();
        } else if (location.equals(LocationList.cList.get(1))) {
            altarEncounter();
        } else if (location.equals(LocationList.eList.get(1))) {
            eripmavEncounter();
        }
    }

    // Method to run the encounter with Old Remraf, the farmer at the Tilled Plains.
    private static void farmerEncounter(){
        if (Misc.containsItem("Matriarch's Blood")) {
            // if player bag contains matriarchs blood, call return story
            System.out.println(Story.farmerReturnStory());
            if (!Misc.containsItem("Hero's Map")) {
                Game.player.getPlayerItems().add(ItemList.herosMap()); 
            }
         } else {
            // Else, call farmer story
            System.out.println(Story.farmerStory());
            
         }
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
            Misc.clearConsole();
            Misc.printHeading("APOTHECARY");
            Misc.printHeading("NOSTRAMUS: Well hello there, weary traveller! Welcome to my apothecary. We aim to heal all things - well, all things except a broken heart. There are some things a potion just can't fix.");
            System.out.println("See anything you like?");
            if (Misc.containsItem("Empty Goblet") || Misc.containsItem("Filled Goblet") || Misc.containsItem("Blessed Goblet")) {
                System.out.println("[1] Healing Potion" + "\n[2] Exit");
                int input = Misc.readInt();
                if (input == 1) {
                    // healing potion purchase
                    System.out.println("\nAh yes, these are my specialty and a favourite of travellers such as yourself.\nThat'll be 10g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(10, ItemList.healingPotion());
                }
                if (input == 2) {
                    purchase = false;
                    return; // TODO This might be 'return' instead- need to test.
                }
            } else {
                System.out.println("[1] Healing Potion" + "\n[2] Empty Goblet" + "\n[3] Exit");
                int input = Misc.readInt();
                if (input == 1) {
                    // Healing potion purchase
                    System.out.println("\nAh yes, these are my specialty and a favourite of travellers such as yourself.\nThat'll be 10g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(10, ItemList.healingPotion());
                }
                if (input == 2) {
                    // Empty goblet purchase
                    System.out.println( "\nOh, this old thing? Well... I suppose I could give it to you - for a price.\nI think 30g is fair.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(30, ItemList.emptyGoblet()); 
                    Story.nostramusGobletStory();
                }
                if (input == 3) {
                    purchase = false;
                    break;
                }
            }
        }
    }
    
    private static void maidenTearsEncounter() {
        if (Misc.containsItem("Empty Goblet")) {
            System.out.println(Story.tearsSucceedStory());
            Misc.continueKey();
            Game.player.getPlayerItems().remove(ItemList.emptyGoblet());
            Game.player.getPlayerItems().add(ItemList.filledGoblet());
         } else {
            System.out.println(Story.tearsFailStory());
            Misc.continueKey();
         }
    }

    private static void altarEncounter() {
        // TODO
    }

    private static void eripmavEncounter() {
        // TODO
    }
}
