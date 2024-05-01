
public class Player  {

    //attributes for all character
    public String name;
    public int maxHp, curHp, xp;

    // additional player stats
    int stamina, gold, rests, potions;

    // integers to store number of skill upgrades
    public int numAtkUpgrades, numDefUpgrades;

    // variable to store player affinity path
    public String playerAffinity;

    // arrays to store skill names
    public String[] atkUpgrades = { "atk1", "atk2", "atk3", "atk4" };
    public String[] defUpgrades = { "def1", "def2", "def3", "def4" };

    // Player specific constructor
    public Player(String name) {
        // calling constructor from Character class
        this.name = name;
        this.maxHp = 100;
        this.xp = 0;
        this.curHp = maxHp;
        // setting upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0; 
        // settting additional player stats
        this.stamina = 100;
        this.gold = 10;
        this.rests = 1;
        this.potions = 0;
        // let the player choose an affinity when creating a new character
        chooseAffinity();
    }

    //player specific attack calculation
    public int attack() {
        return (int) (Math.random() * xp/3) + 1 + (numAtkUpgrades * 4) + (numDefUpgrades * 1);
    }

    //player specific defence calculation
    public int defence() {
        return (int) (Math.random() * xp/3) + 1 + (numDefUpgrades * 4) + (numAtkUpgrades * 1);
    }

    // let the player choose an affinity path
    public void chooseAffinity() {
        boolean affinityChosen = false;
        do {
            Game.clearConsole();
            Game.printHeading("Choose your affinity:");
            System.out.println("[1] Warrior's Might");
            System.out.println("[2] Arcanist's Vision");
            System.out.println("[3] Mercenary's Cunning");
            int choice = Game.readInt();

            //confirm Warrior affinity
            if (choice == 1) {
                do {
                    Game.clearConsole();
                    System.out.println("Are you sure you want to choose the Warrior's Path?");
                    System.out.println("[1] Yes, i'm sure.\n[2] No, let me rechoose.");
                    int input = Game.readInt();
                    if (input == 1) {
                        playerAffinity = "Warrior's Might";
                        affinityChosen = true;
                        break;
                    } else if (input == 2) {
                        affinityChosen = false;
                        break;
                    }
                } while (!affinityChosen);

            //confirm Arcanist affinity
            } else if (choice == 2) {
                do {
                    Game.clearConsole();
                    System.out.println("Are you sure you want to choose the Arcanist's Path?");
                    System.out.println("[1] Yes, i'm sure.\n[2] No, let me rechoose.");
                    int input = Game.readInt();
                    if (input == 1) {
                        playerAffinity = "Arcanist's Vision";
                        affinityChosen = true;
                    } else if (input == 2) {
                        affinityChosen = false;
                    }
                } while (!affinityChosen);

            //confirm Mercenary affinity
            } else if (choice == 3) {
                do {
                    Game.clearConsole();
                    System.out.println("Are you sure you want to choose the Mercenary's Path?");
                    System.out.println("[1] Yes, i'm sure.\n[2] No, let me rechoose.");
                    int input = Game.readInt();
                    if (input == 1) {
                        playerAffinity = "Mercenary's Cunning";
                        affinityChosen = true;
                    } else if (input == 2) {
                        affinityChosen = false;
                        break;
                    }
                } while (!affinityChosen);
            }
        } while (!affinityChosen);
        affinityPath();
    }

    public void affinityPath(){
        if (playerAffinity.equals("Warrior's Might")) {
            atkUpgrades[0] = "STR ATK1"; 
            atkUpgrades[1] = "STR ATK2"; 
            atkUpgrades[2] = "STR ATK3"; 
            atkUpgrades[3] = "STR ATK4"; 
            defUpgrades[0] = "STR DEF1";
            defUpgrades[1] = "STR DEF2";
            defUpgrades[2] = "STR DEF3";
            defUpgrades[3] = "STR DEF4";
        }
        if (playerAffinity.equals("Arcanist's Vision")) {
            atkUpgrades[0] = "INT ATK1"; 
            atkUpgrades[1] = "INT ATK2"; 
            atkUpgrades[2] = "INT ATK3"; 
            atkUpgrades[3] = "INT ATK4"; 
            defUpgrades[0] = "INT DEF1";
            defUpgrades[1] = "INT DEF2";
            defUpgrades[2] = "INT DEF3";
            defUpgrades[3] = "INT DEF4";
        }
        if (playerAffinity.equals("Mercenary's Cunning")) {
            atkUpgrades[0] = "DEX ATK1"; 
            atkUpgrades[1] = "DEX ATK2"; 
            atkUpgrades[2] = "DEX ATK3"; 
            atkUpgrades[3] = "DEX ATK4"; 
            defUpgrades[0] = "DEX DEF1";
            defUpgrades[1] = "DEX DEF2";
            defUpgrades[2] = "DEX DEF3";
            defUpgrades[3] = "DEX DEF4";
        }
        chooseUpgrade();
    }

    // let the player choose an upgrade of either path
    public void chooseUpgrade() {
        boolean upgradeChosen = false;
        do {
            Game.clearConsole();
            Game.printHeading("Choose an upgrade:");
            System.out.println("[1] " + atkUpgrades[numAtkUpgrades]);
            System.out.println("[2] " + defUpgrades[numDefUpgrades]);
            // get the players choice:
            int input = Game.readInt();
            if (input == 1) {
                Game.clearConsole();
                Game.printHeading("You chose " + atkUpgrades[numAtkUpgrades] + "!");
                numAtkUpgrades++;
                upgradeChosen = true;
                break;
            } else if (input == 2) {
                Game.clearConsole();
                Game.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
                numDefUpgrades++;
                upgradeChosen = true;
                break;
            }
        } while (!upgradeChosen);
    }
}