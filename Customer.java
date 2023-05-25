import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    // Customer has name, email address, number of purchases, and a bag for shopping for items
    private String name;
    private String email;
    private int purchases = 0;
    private ArrayList<String> bag = new ArrayList<String>();
    
    /**
    * Constructor for Customer object
    * @param name, email
    * @author FrankJunkar
    */
    public Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    /**
     * The function will go through a store's inventory and print it out to the user. If the user inputs a valid number
     * the item will be added to their bag, and their total purchases will be increased.
     * @param shoppingStore
     * @author FrankJunkar
     */
    public void purchaseItem(Store shoppingStore){
        int number = 0;
        Scanner input = new Scanner(System.in);
        ArrayList inv = shoppingStore.getInventory();
        for(int i = 0; i < inv.size(); i++ ){
            System.out.println(Integer.toString(i+1) + ": " + inv.get(i));
        }
        
        // Keeps putting new items for purchase into bag
        while(true){
            number = 0;
            System.out.print("Enter the number for the item that you would like to purchase: ");
            number = input.nextInt();
            if(number > 0 && (number <= inv.size())){
                bag.add((String) inv.get(number-1));
                purchases ++;
                break;
            }
            System.out.println("\nThat value is incorrect!");
        }
    }

    /**
     * Return all the items in a customer's bag
     * @return
     * @author FrankJunkar
     */
    public ArrayList<String> getBagItems(){
        return bag;
    }

    /**
     * Returns the amount of purchases that a customer has made
     * @return
     * @author FrankJunkar
     */
    public int getPurchases(){
        return purchases;
    }

    /**
     * Will print the customer's class in a more user readable way
     * @return
     * @author FrankJunkar
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", purchases=" + purchases +
                '}';
    }
}
