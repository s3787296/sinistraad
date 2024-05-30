public class ItemList {

    // Method to create and return the Hero's Sword item
    public static Item herosSword() {
        Item herosSword = new Item("Hero's Sword", "Weapon",
                "Old Remraf had this sword laying around. It's worn with age, and feels good in your hand.",
                "+10 Attack");
        Game.player.setWeaponAtk(10);
        return herosSword;
    }

    // Method to create and return the Wolfhide Armour item
    public static Item wolfhideArmour() {
        Item wolfhideArmour = new Item("Wolfhide Armour", "Armour",
                "Crudely stripped wolfskin tied around ones torso like a tunic.\nThe dense matted fur and sinewy skin of the Duskwood werewolf makes for excellent protection.",
                "+20 Defence");
        Game.player.setArmourDef(20);
        return wolfhideArmour;
    }

    // Method to create and return the Hero's Map item
    public static Item herosMap() {
        Item herosMap = new Item("Hero's Map", "Quest",
                "An aged scroll filled with the knowledge of many generations of adventurers.\nThe map isn’t fully complete, maybe you could finish it on your journey!",
                "Forest Access");
        return herosMap;
    }

    // Method to create and return the Matriarch's Blood item
    public static Item matriarchsBlood() {
        Item matriarchsBlood = new Item("Matriarch's Blood", "Bonus",
                "The sickly green blood from this unholy arachnid stains your hands.\nYou you feel the immense strength of a spider fuel your each and every movement.",
                "+10 Attack");
        Game.player.setBonusAtk(10);
        return matriarchsBlood;
    }

    // Method to create and return the Chamber Key item
    public static Item cathedralKey() {
        Item cathedralKey = new Item("Cathedral Key", "Quest",
                "A dainty golden key that matches the goblet you collected earlier.\nIts engraved with a script you’ve never seen before and has an odd resonance of the castle's ancient halls.",
                "Cathedral Access");
        return cathedralKey;
    }

    // Method to create and return the Gate Key item
    public static Item gateKey() {
        Item gateKey = new Item("Gate Key", "Quest",
                "A large, rusty key, given to you by Gatekeeper Syek.\nThe weight of the key reminds you of the weight of your journey still ahead.",
                "Castle Entrance Access");
        return gateKey;
    }

    // Method to create and return the Maiden's Blessing item
    public static Item maidensBlessing() {
        Item maidensBlessing = new Item("Maiden's Blessing", "Bonus",
                "Upon defeating the Lost Maiden, the fresh air of the clearing fills your lungs.\nYou you feel your muscles revitalize, becoming stronger.",
                "+10 Defence");
        Game.player.setBonusDef(10);
        return maidensBlessing;
    }

    // Method to create and return the healing potion item
    public static Item healingPotion() {
        Item healingPotion = new Item("Healing Potion", "Consumable",
                "A small round flask filled with a bright red, syrupy elixir.\nThe crafting of a health potion is a closely guarded secret by the apothecary’s guild,\nwho fund their research by selling such potent tinctures.",
                "Full Heal");
        return healingPotion;
    }

    // Method to create and return the Empty Goblet item
    public static Item emptyGoblet() {
        Item emptyGoblet = new Item("Empty Goblet", "Quest",
                "A golden goblet engraved with intricate patterns, reminiscent of royalty.",
                "?");
        return emptyGoblet;
    }

    // Method to create and return the Filled Goblet item
    public static Item filledGoblet() {
        Item filledGoblet = new Item("Filled Goblet", "Quest",
                "A golden goblet engraved with intricate patterns, reminiscent of royalty. It is filled with the tears of the Lost Maiden.",
                "?");
        return filledGoblet;
    }

    // Method to create and return the Forgemaster's Greatsword item
    public static Item forgemastersGreatsword() {
        Item forgemastersGreatsword = new Item("Forgemaster's Greatsword", "Weapon",
                "A perfectly balanced sword that glows with the heat of the forge, the silver patterns shining brightly.\nOnly the hands of a master forger could even dream of such a weapon.",
                "+50 Attack");
        Game.player.setWeaponAtk(50);
        return forgemastersGreatsword;
    }

    // Method to create and return the Blessed Goblet item
    public static Item blessedGoblet() {
        Item blessedGoblet = new Item("Blessed Goblet", "Quest",
                "The golden goblet now feels slightly warm as its gems glow with iridescent brilliance.\nHoly water swills inside.",
                "?");
        return blessedGoblet;
    }

    // Method to create and return the Count Eripmav Defeated item
    public static Item eripmavDefeated() {
        Item eripmavDefeated = new Item("Count Eripmav Defeated", "Quest",
                "You have defeated the Count. Congratulations",
                "?");
        return eripmavDefeated;
    }
}
