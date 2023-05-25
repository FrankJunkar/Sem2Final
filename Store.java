import java.util.ArrayList;

public class Store {
    // Store has name and list of inventory
    private String name;
    private ArrayList<String> inventory = new ArrayList<String>();
    
    /**
    * Constructor for Store object
    * @param name
    * @author FrankJunkar
    */
    public Store(String name){
        this.name = name;
    }

    /**
     * Adds a item to the Store's inventory ArrayList
     * @param item
     * @author FrankJunkar
     */
    public void addItem(String item){
        inventory.add(item);
    }

    /**
     * Returns the inventory
     * @return
     * @author FrankJunkar
     */
    public ArrayList<String> getInventory(){
        return inventory;
    }
}
