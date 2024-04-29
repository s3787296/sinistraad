
public class Player extends Character{

    // integers to store number of stat points
    public int strength, intelligence, dexterity;

    // Arrays to store skill names
    public String[] strengthskills = { "Warrior's Might: 10% increased int and dmg gained from int" };
    public String[] intelligenceskills = { "Arcanists's Vision: 10% increased int and dmg gained from int" };
    public String[] dexterityskills = { "Mercenary's Cunning: 10% increased dex and dmg gained from dex" };

    // Player specific constructor
    public Player(String name) {
        // using constructor from Character class
        super(name, 100, 0);
        this.strength = 0;
        this.intelligence = 0;
        this.dexterity = 0;
        // let the player choose a skill when creating a new character
        chooseSkill();
    }

    // let the player choose a skill of either tree
    public void chooseSkill() {
        boolean chooseSkill = false;
        do {
        Game.clearConsole();
        Game.printHeading("Choose a skill:");
        System.out.println("[1] " + strengthskills[strength]);
        System.out.println("[2] " + intelligenceskills[intelligence]);
        System.out.println("[3] " + dexterityskills[dexterity]);
        // get the players choice:
        int input = Game.readInt(3);
        Game.clearConsole();
        if (input == 1){
            Game.printHeading("You chose " + strengthskills[strength] + "!");
            strength++;
            chooseSkill = true;
        }
        else if (input == 2){
            Game.printHeading("You chose " + intelligenceskills[intelligence] + "!");
            intelligence++;
            chooseSkill = true;
        }
        else if (input == 3){
            Game.printHeading("You chose " + dexterityskills[dexterity] + "!");
            dexterity++;
            chooseSkill = true;
        }
        Game.continueKey();
        } while (!chooseSkill);
        
    }

    @Override
    public int attack() {
        return (int) (Math.random());
    }

    @Override
    public int defence(){
        return (int) (Math.random());
    }
}