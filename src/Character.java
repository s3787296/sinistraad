
public abstract class Character {
    
    //attributes for all character
    public String name;
    public int maxHp, hp, xp;

    //constructor for character
    public Character(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }

    //methods for all characters
    public abstract int attack();
    public abstract int defence();
}
