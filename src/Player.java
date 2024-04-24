
public class Player extends Character{

    //Player specific constructor
    public Player(String name){
        //using constructor from Character class
        super(name, 100, 0);
    }

    @Override
    public int attack(){
        return 0;
    }

    @Override
    public int defence(){
        return 0;
    }
}