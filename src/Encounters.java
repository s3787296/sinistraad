public class Encounters {

    // list of non combat player encounters
    public static void playerEncounters(Location location){
        if (location.equals(LocationList.cList.get(2))) {
            apothecaryEncounter();
        }
        else if (location.equals(LocationList.eList.get(4))) {
            farmerEncounter();
        }
    }

    private static void farmerEncounter(){
        if (!Game.player.getPlayerItems().contains(LocationList.eList.get(3).getItem())) {
            System.out.println(Story.farmerStory());
         } else {
            System.out.println(Story.farmerReturnStory());
         }
    }


    private static void apothecaryPurchase(int gold) {
        int option = Misc.readInt();
        if (option == 1) {
            if (Game.player.getGold() >= gold) {
                System.out.println("\nhehe.. how wise of you...");
                Game.player.getPlayerPotions().add(ItemList.healingPotion());
                Game.player.setGold(Game.player.getGold() - gold);
                Misc.continueKey();
            } else {
                System.out.println(
                        "\nOh how...unfortunate, it seems you do not have the coin to match... maybe next time...hehe.");
                Misc.continueKey();
            }
        } else if (option == 2) {
            System.out.println("\nOh... Very well...");
            Misc.continueKey();
        }
    }

    private static void apothecaryEncounter() {
        boolean purchase = true;
        while (purchase) {
            Misc.clearConsole();
            Misc.printHeading("APOTHECARY");
            Misc.printHeading("NOSTRAMUS: Well hello there, weary traveller... Welcome to my store of assorted...goods..hehe..");
            System.out.println("See anything you like?");
            System.out.println("[1] Healing Potion" + "\n[2] Empty Goblet" + "\n[3] Exit");
            int input = Misc.readInt();
            if (input == 1) {
                // healing potion purchase
                System.out.println("\nAh yes, my speciality and the travellers favourite.\nThat'll be 10g thank you.");
                System.out.println("[1] Accept" + "\n[2] Decline");
                apothecaryPurchase(10);
            }
            if (input == 2) {
                // empty goblet purchase
                System.out.println(
                        "\nOh, this old thing... well i suppose i could give it to you...for a price\nThat'll be 30g thank you.");
                System.out.println("[1] Accept" + "\n[2] Decline");
                apothecaryPurchase(30);
            }
            if (input == 3) {
                purchase = false;
                break;
            }
        }
    }
    // TODO Non-boss item drop encounter: Cathedral for holy water
    // TODO Figure out where the sword sits and why you can spawn a whole lot of them.
}
