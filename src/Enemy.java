
public class Enemy {

    //attributes for all characters
    public String name;
    public int maxHp, curHp, xp;
    
    // variable to store players values
    int playerXp, playerHp;

    // enemy specific constructor
    public Enemy(String name, int playerHp, int playerXp) {
        //character constructor
        this.name = name;
        this.maxHp = (int)(Math.random()*playerXp)+10;
        this.curHp = maxHp;
        this.xp = (int) (Math.random()*(playerXp/4)+5);
        this.playerXp = playerXp;
    }

    // Enemy specific attack calculation
    public int attack() {
        return (int) (Math.random()*(playerXp/4)+(xp/4+1));
    }

    // Enemy specific defence calculation
    public int defence() {
        return (int) (Math.random()*(playerXp/4)+(xp/4+1));
    }

}