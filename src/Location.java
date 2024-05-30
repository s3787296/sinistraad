import java.util.ArrayList;

/**
 * Location class contains all location attributes and constructors.
 * @author Max
 */
public class Location {
    
    /**
     * Core location attributes
     */
    private String name;
    private String story;
    private String area;
    private String map;
    private Item item;
    private Enemy enemy;
    /**
     * Location specific arraylist which will be modified when items are dropped or picked up by the player.
     */
    private ArrayList<Item> locationItems;

    /**
     * Getter method for location area
     * @return
     */
    public String getArea() {
        return this.area;
    }

    /**
     * Setter method for location area
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Getter method for location name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for location name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for location story
     * @return
     */
    public String getStory() {
        return this.story;
    }

    /**
     * Setter method for location story
     * @param story
     */
    public void setStory(String story) {
        this.story = story;
    }

    /**
     * Getter method for location's spawnable enemies 
     * @return
     */
    public Enemy getEnemy() {
        return this.enemy;
    }

    /**
     * Setter method for location's spawnable enemies 
     * @param enemy
     */
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    /**
     * Getter method for locations map
     * @return
     */
    public String getMap() {
        return this.map;
    }

    /**
     * Setter method for locations map
     * @param map
     */
    public void setMap(String map) {
        this.map = map;
    }

    /**
     * Getter method for location items 
     * @return
     */
    public Item getItem() {
        return this.item;
    }

    /**
     * Setter method for location items
     * @param item
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Getter method for location arraylist
     * @return
     */
    public ArrayList<Item> getLocationItems() {
        return this.locationItems;
    }

    /**
     * Setter method for location arraylist
     * @param itemList
     */
    public void setLocationItems(ArrayList<Item> itemList) {
        this.locationItems = itemList;
    }

    /**
     * Primary constructor for location object
     * @param name
     * @param map
     * @param area
     * @param story
     */
    public Location(String name, String map, String area, String story) {
        this.name = name;
        this.map = map;
        this.area = area;
        this.story = story;
        this.locationItems = new ArrayList<Item>();
    }

    /**
     * Secondary constructor for location object
     * @param name
     * @param map
     * @param area
     * @param story
     * @param enemy
     */
    public Location(String name, String map, String area, String story, Enemy enemy) {
        this.name = name;
        this.map = map;
        this.area = area;
        this.story = story;
        this.enemy = enemy;
        this.locationItems = new ArrayList<Item>();
    }
}
