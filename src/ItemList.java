public class ItemList {

    // method to create and return the hero's sword item
    public static Item herosSword() {
        Item herosSword = new Item("Hero's Sword", "Weapon",
                "Your fathers sword, the sword he used to help defend the town from the attacks from the creatures that came from the forest, upon his passing, he left it to you to continue to defend the town. \"",
                "+10 Attack");
        Game.player.setWeaponAtk(10);
        return herosSword;
    }

    // method to create and return the wolfhide armour item
    public static Item wolfhideArmour() {
        Item wolfhideArmour = new Item("Wolfhide Armour", "Armour",
                "Crudely stripped wolfskin tied around ones torso like a tunic.\nThe dense matted fur and sinewy skin of the Duskwood werewolf makes for excellent protection.",
                "+20 Defence");
        Game.player.setArmourDef(20);
        return wolfhideArmour;
    }

    // method to create and return the hero's map item
    public static Item herosMap() {
        Item herosMap = new Item("Hero's Map", "Quest",
                "An aged scroll filled with the knowledge of many generations of adventurers.\nThe map isn’t fully complete, maybe you could finish it on your journey!",
                "Forest Access");
        return herosMap;
    }

    // method to create and return the matriarch's blood item
    public static Item matriarchsBlood() {
        Item matriarchsBlood = new Item("Matriarch's Blood", "Bonus",
                "The sickly green blood from this unholy arachnid stains your hands.\nYou you feel the immense strength of a spider fuel your each and every movement ( Attack up!)",
                "+10 Attack");
        Game.player.setBonusAtk(10);
        return matriarchsBlood;
    }

    // method to create and return the chamber key item
    public static Item chamberKey() {
        Item chamberKey = new Item("Chamber Key", "Quest",
                "A dainty golden key that matches the goblet you collected earlier.\nIts engraved with a script you’ve never seen before and has an odd resonance of the castles ancient halls.",
                "Chamber Access");
        return chamberKey;
    }

    // method to create and return the gate key item
    public static Item gateKey() {
        Item gateKey = new Item("Gate Key", "Quest",
                "A large, rusty key, torn from the collar of the stoneskin gargoyle now slayed.\nThe weight of the key reminds you of the weight of your journey still ahead.",
                "Gate Access");
        return gateKey;
    }

    // method to create and return the maiden's blessing item
    public static Item maidensBlessing() {
        Item maidensBlessing = new Item("Maiden's Blessing", "Bonus",
                "Upon defeating the maiden of the lake the fresh air of the clearing fills your lungs.\nYou you feel your muscles revitalize, becoming tougher. (Defense up!)",
                "+10 Defence");
        Game.player.setBonusDef(10);
        return maidensBlessing;
    }

    // method to create and return the healing potion item
    public static Item healingPotion() {
        Item healingPotion = new Item("Healing Potion", "Consumable",
                "A small round flask filled with a bright red syrupy elixir.\nThe crafting of a health potion is a closely guarded secret by the apothecary’s guild,\nwho funds their research by selling such potent tinctures.",
                "Full Heal");
        return healingPotion;
    }

    // method to create and return the plain goblet item
    public static Item plainGoblet() {
        Item plainGoblet = new Item("Plain Goblet", "Quest",
                "A large golden goblet encrusted with perfectly cut jewels reminiscent of royalty.\nHow did it get here?",
                "?");
        return plainGoblet;
    }

    // method to create and return the forgemaster's greatsword item
    public static Item forgemastersGreatsword() {
        Item forgemastersGreatsword = new Item("Forgemaster's Greatsword", "Weapon",
                "A perfectly balanced sword that glows with the heat of the forge.\nOnly the hands of a master forger could even dream of such a weapon.",
                "+50 Attack");
        Game.player.setWeaponAtk(50);
        return forgemastersGreatsword;
    }

    // method to create and return the blessed goblet item
    public static Item blessedGoblet() {
        Item blessedGoblet = new Item("Blessed Goblet", "Quest",
                "The golden goblet now feels slightly warm as its gems glow with iridescent brilliance.\nHoly water swills in the cup of the goblet.",
                "?");
        return blessedGoblet;
    }

}
