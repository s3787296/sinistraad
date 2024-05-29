import java.util.ArrayList;

public class Location {
    
    // core location attributes
    private String name, story, area;
    private Item item;
    private Enemy enemy;

    // location specific arraylist
    private ArrayList<Item> locationItems;

    // getter method for location area
    public String getArea() {
        return this.area;
    }

    // setter method for location area
    public void setArea(String area) {
        this.area = area;
    }

    // getter method for location name
    public String getName() {
        return this.name;
    }

    // setter method for location name
    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return this.story;
    }

    public void setStory(String story) {
        this.story = story;
    }
    
    public Enemy getEnemy() {
        return this.enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    // getter method for location arraylist
    public ArrayList<Item> getLocationItems() {
        return this.locationItems;
    }

    // setter method for location arraylist
    public void setLocationItems(ArrayList<Item> itemList) {
        this.locationItems = itemList;
    }

    // constructor for location object with no item or enemy
    public Location(String name, String area, String story) {
        this.name = name;
        this.area = area;
        this.story = story;
        this.locationItems = new ArrayList<Item>();
    }

    // constructor for location object with no item
    public Location(String name, String area, String story, Enemy enemy) {
        this.name = name;
        this.area = area;
        this.story = story;
        this.enemy = enemy;
        this.locationItems = new ArrayList<Item>();
    }

    // constructor for location object with no enemy
    public Location(String name, String area, String story, Item item) {
        this.name = name;
        this.area = area;
        this.story = story;
        this.item = item;
        this.locationItems = new ArrayList<Item>();
    }

    // constructor for location object with enemy and item
    public Location(String name, String area, String story, Enemy enemy, Item item) {
        this.name = name;
        this.area = area;
        this.story = story;
        this.enemy = enemy;
        this.item = item;
        this.locationItems = new ArrayList<Item>();
    }
}

    
