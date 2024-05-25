public class ItemList {

        // method to add the hero sword item to players inventory
        public static void herosSword() {
            Game.player.getPlayerItems().add(new Item("Hero's Sword", "Weapon", "TBC", "+10 Attack"));
            Game.player.setWeaponAtk(10);
        }
    
        // method to add the wolfhide armour item to players inventory
        public static void wolfhideArmour() {
            Game.player.getPlayerItems().add(new Item("Wolfhide Armour", "Armour", "TBC", "+20 Defence"));
            Game.player.setArmourDef(20);
        }
    
        // method to add the heros map item to players inventory
        public static void herosMap() {
            Game.player.getPlayerItems().add(new Item("Hero's Map", "Quest", "TBC", "Forest Access"));
            // mapAccessKey = true;
        }
    
        // method to add the matriarch's blood item to players inventory
        public static void matriarchsBlood() {
            Game.player.getPlayerItems().add(new Item("Matriarch's Blood", "Bonus", "TBC", "+10 Attack"));
            Game.player.setBonusAtk(10);
        }
    
        // method to add the chamber key item to the players inventory
        public static void chamberKey() {
            Game.player.getPlayerItems().add(new Item("Chamber Key", "Quest", "TBC", "Chamber Access"));
            // chamberAccessKey = true;
        }
    
        // method to add the gate key item to the players inventory
        public static void gateKey() {
            Game.player.getPlayerItems().add(new Item("Gate Key", "Quest", "TBC", "Gate Access"));
            // gateAccessKey = true;
        }
    
        // method to add the maidens blessing to the players inventory
        public static void maidensBlessing() {
            Game.player.getPlayerItems().add(new Item("Maiden's Blessing", "Bonus", "TBC", "+10 Defence"));
            Game.player.setBonusDef(10);
        }
    
        // method to add the archaic goblet to the players inventory
        public static void archaicGoblet() {
            Game.player.getPlayerItems().add(new Item("Archaic Goblet", "Bonus", "TBC", "Null"));
            // holdingGoblet = true;
        }
    
        // method to add the forgemasters greatsword to the players inventory
        public static void forgemastersGreatsword() {
            Game.player.getPlayerItems().add(new Item("Forgemaster's Greatsword", "Weapon", "TBC", "+50 Attack"));
            Game.player.setWeaponAtk(50);
        }
}
