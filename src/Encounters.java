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
            // If player bag doesn't contain the Hero's Map, call farmerStory()
            System.out.println(Story.farmerStory());
            Game.player.getPlayerItems().add(ItemList.herosMap()); // TODO Check this - seems to be in Direction as well? (at the bottom)
         } else {
            // Else, call farmerReturnStory
            System.out.println(Story.farmerReturnStory());
         }
    }

    // Method to let player make a purchase when they are within the apothecaryEncounter() method
    private static void apothecaryPurchase(int gold) {// TODO INPUT FOR ITEM TYPE
        int option = Misc.readInt();
        if (option == 1) {
            // If player selects "[1] Accept"
            if (Game.player.getGold() >= gold) {
                // If player has exactly or more than the amount of gold the item costs, add the healing potion to their bag
                System.out.println("\nA most splendid choice, dear friend. Do stop by again, won't you?");
                Game.player.getPlayerPotions().add(ItemList.healingPotion());
                Game.player.setGold(Game.player.getGold() - gold);
                Misc.continueKey();
            } else {
                // Print failure message
                System.out.println(
                        "\nOh, how unfortunate - it seems you do not have the coin to match... Perhaps another time.");
                Misc.continueKey();
            }
        } else if (option == 2) {
            // If player selects "[1] Accept"
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
            if (Game.player.getPlayerItems().contains(ItemList.emptyGoblet()) || Game.player.getPlayerItems().contains(ItemList.filledGoblet()) || Game.player.getPlayerItems().contains(ItemList.blessedGoblet())) {
                System.out.println("[1] Healing Potion" + "\n[2] Exit");
                int input = Misc.readInt();
                if (input == 1) {
                    // healing potion purchase
                    System.out.println("\nAh yes, these are my specialty and a favourite of travellers such as yourself.\nThat'll be 10g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(10);
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
                    apothecaryPurchase(10);
                }
                if (input == 2) {
                    // Empty goblet purchase
                    System.out.println(
                            "\nOh, this old thing? Well... I suppose I could give it to you - for a price.\nI think 30g is fair.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(30); // TODO This isn't right - it adds a healing potion instead of the goblet.
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
        if (!Game.player.getPlayerItems().contains(LocationList.dList.get(2).getItem())) {
            System.out.println(Story.tearsFailStory());
         } else {
            System.out.println(Story.tearsSucceedStory());
         } // TODO Double check this & add comments
    }

    private static void altarEncounter() {
        // TODO
    }

    private static void eripmavEncounter() {
        // TODO
    }
}
