import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<String> inventory = new ArrayList<String>();

    public Store(String name){
        this.name = name;
    }

    /**
     * Adds a item to the Store's inventory ArrayList
     * @param item
     */
    public void addItem(String item){
        inventory.add(item);
    }

    /**
     * Returns the inventory
     * @return
     */
    public ArrayList<String> getInventory(){
        return inventory;
    }
}
