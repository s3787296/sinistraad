import java.util.ArrayList;

public class Location {
    
    // Core location attributes
    private String name;
    private String story;
    private String area;
    private String map;
    private Item item;
    private Enemy enemy;

    // Location specific arraylist which will be modified when items are dropped or picked up by the player.
    private ArrayList<Item> locationItems;

    // Getter method for location area
    public String getArea() {
        return this.area;
    }

    // Setter method for location area
    public void setArea(String area) {
        this.area = area;
    }

    // Getter method for location name
    public String getName() {
        return this.name;
    }

    // Setter method for location name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for location story
    public String getStory() {
        return this.story;
    }

    // Setter method for location story
    public void setStory(String story) {
        this.story = story;
    }

    // Getter method for location's spawnable enemies 
    public Enemy getEnemy() {
        return this.enemy;
    }

    // Setter method for location's spawnable enemies 
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    // Getter method for locations map
    public String getMap() {
        return this.map;
    }

    // Setter method for locations map
    public void setMap(String map) {
        this.map = map;
    }

    // Getter method for location items 
    public Item getItem() {
        return this.item;
    }

    // Setter method for location items
    public void setItem(Item item) {
        this.item = item;
    }

    // Getter method for location arraylist
    public ArrayList<Item> getLocationItems() {
        return this.locationItems;
    }

    // Setter method for location arraylist
    public void setLocationItems(ArrayList<Item> itemList) {
        this.locationItems = itemList;
    }

    // Constructor for location object with no item or enemy
    public Location(String name, String map, String area, String story) {
        this.name = name;
        this.map = map;
        this.area = area;
        this.story = story;
        this.locationItems = new ArrayList<Item>();
    }

    // Constructor for location object with no item
    public Location(String name, String map, String area, String story, Enemy enemy) {
        this.name = name;
        this.map = map;
        this.area = area;
        this.story = story;
        this.enemy = enemy;
        this.locationItems = new ArrayList<Item>();
    }

    // Constructor for location object with no enemy // TODO check if still needed
    public Location(String name, String area, String story, Item item) {
        this.name = name;
        this.area = area;
        this.story = story;
        this.item = item;
        this.locationItems = new ArrayList<Item>();
    }

    // Constructor for location object with enemy and item // TODO check if still needed
    public Location(String name, String area, String story, Enemy enemy, Item item) {
        this.name = name;
        this.area = area;
        this.story = story;
        this.enemy = enemy;
        this.item = item;
        this.locationItems = new ArrayList<Item>();
    }
}
