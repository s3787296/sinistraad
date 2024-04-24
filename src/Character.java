
public abstract class Character {
    
    //attributes for all character
    public String name;
    public int maxhp, hp, xp;

    //constructor for character
    public Character(String name, int maxhp, int xp){
        this.name = name;
        this.maxhp = maxhp;
        this.xp = xp;
        this.hp = maxhp;
    }

    //methods for all characters
    public abstract int attack();
    public abstract int defence();
}
