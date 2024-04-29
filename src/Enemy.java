
public class Enemy extends Character {

    // variable to store players xp
    int playerXp;

    // enemy specific constructor
    public Enemy(String name, int playerXp) {
        // using constructor from Character class
        super(name, (int) (Math.random() * playerXp + playerXp / 3 + 5), (int) (Math.random() * (playerXp / 4 + 2) + 1));
        //assigning variable
        this.playerXp = playerXp;
    }

    // Enemy specific attack and defence calculations
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defence() {
        return 0;
    }

}