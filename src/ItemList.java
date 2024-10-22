/**
 * ItemList class contains methods to create and return objects of Item.
 * 
 * @author Max
 * @author Amelia
 * @author Jude
 * @version 1.0
 */
public class ItemList {

    /**
     * Method to create and return the Hero's Sword item.
     * 
     * @return New instance of Hero's Sword
     */
    public static Item herosSword() {
        Item herosSword = new Item("Hero's Sword", "Weapon", "Old Remraf had this sword laying around. It's worn with age, and feels good in your hand.", "+5 Attack");
        return herosSword;
    }

    /**
     * Method to create and return the Hero's Garb item.
     * 
     * @return New instance of Hero's Garb
     */
    public static Item herosGarb() {
        Item herosGarb = new Item("Hero's Garb", "Armour",
                "Practical and tactical, the garments of a true hero.",
                "+5 Armour");
        return herosGarb;
    }

    /**
     * Method to create and return the Wolfhide Armour item.
     * 
     * @return New instance of Wolfhide Armour
     */
    public static Item wolfhideArmour() {
        Item wolfhideArmour = new Item("Wolfhide Armour", "Armour",
                "Crudely stripped werewolf hide tied around ones torso like a tunic.\nThe dense matted fur and sinewy skin of the Duskwood werewolf makes for excellent protection.",
                "+15 Defense");
        return wolfhideArmour;
    }
    /**
     * Method to create and return the Hero's Map item.
     * 
     * @return New instance of Hero's Map
     */
    public static Item herosMap() {
        Item herosMap = new Item("Hero's Map", "Quest",
                "An aged scroll filled with the knowledge of many generations of adventurers.\nIt will help you find your way.",
                "Forest Access");
        return herosMap;
    }

    /**
     * Method to create and return the Matriarch's Blood item.
     * 
     * @return New instance of Matriarch's Blood
     */
    public static Item matriarchsBlood() {
        Item matriarchsBlood = new Item("Matriarch's Blood", "Bonus",
                "The sickly green blood from this unholy arachnid stains your hands.\nYou you feel the immense strength of a spider fuel your each and every movement.",
                "+10 Attack");
        return matriarchsBlood;
    }

    /**
     * Method to create and return the Chamber Key item.
     * 
     * @return New instance of Cathedral Key
     */
    public static Item cathedralKey() {
        Item cathedralKey = new Item("Cathedral Key", "Quest",
                "A dainty golden key that matches the goblet you collected earlier.\nIts engraved with a script you've never seen before and has an odd resonance of the castle's ancient halls.",
                "Cathedral Access");
        return cathedralKey;
    }

    /**
     * Method to create and return the Gate Key item.
     * 
     * @return New instance of Gate Key
     */
    public static Item gateKey() {
        Item gateKey = new Item("Gate Key", "Quest",
                "A large, rusty key, given to you by Gatekeeper Syek.\nThe weight of the key reminds you of the weight of your journey still ahead.",
                "Castle Entrance Access");
        return gateKey;
    }

    /**
     * Method to create and return the Maiden's Blessing item.
     * 
     * @return New instance of Maiden's Blessing
     */
    public static Item maidensBlessing() {
        Item maidensBlessing = new Item("Maiden's Blessing", "Bonus",
                "Upon defeating the Lost Maiden, the fresh air of the clearing fills your lungs.\nYou you feel your muscles revitalize, becoming stronger.",
                "+10 Defense");
        return maidensBlessing;
    }

    /**
     * Method to create and return the Healing Potion item.
     * 
     * @return New instance of Healing Potion
     */
    public static Item healingPotion() {
        Item healingPotion = new Item("Healing Potion", "Consumable",
                "A small round flask filled with a bright red, syrupy elixir.\nThe crafting of a health potion is a closely guarded secret by the apothecary's guild,\nwho fund their research by selling such potent tinctures.",
                "Full Heal");
        return healingPotion;
    }

    /**
     * Method to create and return the Empty Goblet item.
     * 
     * @return New instance of Empty Goblet
     */
    public static Item emptyGoblet() {
        Item emptyGoblet = new Item("Empty Goblet", "Quest",
                "A golden goblet engraved with intricate patterns, reminiscent of royalty.",
                "?");
        return emptyGoblet;
    }

    /**
     * Method to create and return the Filled Goblet item.
     * 
     * @return New instance of Filled Goblet
     */
    public static Item filledGoblet() {
        Item filledGoblet = new Item("Filled Goblet", "Quest",
                "A golden goblet engraved with intricate patterns, reminiscent of royalty. It is filled with the tears of the Lost Maiden.",
                "?");
        return filledGoblet;
    }

    /**
     * Method to create and return the Forgemaster's Greatsword item.
     * 
     * @return New instance of Forgemaster's Greatsword
     */
    public static Item forgemastersGreatsword() {
        Item forgemastersGreatsword = new Item("Forgemaster's Greatsword", "Weapon",
                "A perfectly balanced sword that glows with the heat of the forge, the silver patterns shining brightly.\nOnly the hands of a master forger could even dream of such a weapon.",
                "+15 Attack");
        return forgemastersGreatsword;
    }

    /**
     * Method to create and return the Blessed Goblet item.
     * 
     * @return New instance of Blessed Goblet
     */
    public static Item blessedGoblet() {
        Item blessedGoblet = new Item("Blessed Goblet", "Quest",
                "The golden goblet now feels slightly warm as its gems glow with iridescent brilliance.\nHoly water swills inside.",
                "?");
        return blessedGoblet;
    }
}
