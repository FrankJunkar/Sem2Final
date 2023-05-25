import java.util.ArrayList;

public class SuperMarket extends Store{
    // SuperMarket has a general rewards program and an exclusive rewards program, which can only hold 20 people
    private ArrayList<Customer> GeneralRewardsProgram = new ArrayList<Customer>();
    private Customer[] ExclusiveRewardsProgram = new Customer[20];
    
    /*
    * Constructor for SuperMarket object
    * @param name
    * @author FrankJunkar
    */
    public SuperMarket(String name){
        super(name);
    }

    /**
     * Adds a customer to the general rewards program (has no limit)
     * @param cust
     * @author FrankJunkar
     */
    public void addToGeneral(Customer cust){
        GeneralRewardsProgram.add(cust);
    }

    /**
     * The program first checks if there are any unfilled or null values in the array and if there is none, then it will
     * add the customer to the array. If the array is filled, then the program will find the customer with the lowest
     * purchases in the array and replace them with the new customer given the new customer has more purchases.
     * @param cust
     * @author FrankJunkar
     */
    public void addToExclusive(Customer cust){
        boolean flag = true;
        // Finds first open spot in exclusive rewards program arraylist and adds specified customer to it
        for(int i =0; i < ExclusiveRewardsProgram.length; i++){
            if(ExclusiveRewardsProgram[i] == null){
                ExclusiveRewardsProgram[i] = cust;
                flag = false;
                break;
            }
        }
        // What happens if exclusive rewards program arraylist is full
        if(flag){
            int lowest = Integer.MAX_VALUE;
            int index = 0;
            // Loops through people in exclusive rewards program arraylist
            for(int j = 0; j < ExclusiveRewardsProgram.length; j++){
                // Finds customer with least purchases
                if(ExclusiveRewardsProgram[j].getPurchases() < lowest){
                    lowest = ExclusiveRewardsProgram[j].getPurchases();
                    index = j;
                }
            }
            // Replaces customer with least purchases with specified customer
            if(cust.getPurchases() >= lowest){
                ExclusiveRewardsProgram[index] = cust;
            }
        }
    }

    /**
     * returns a list of the people in the general rewards program
     * @return
     * @author FrankJunkar
     */
    public ArrayList<Customer> getGeneralRewardsProgram(){
        return GeneralRewardsProgram;
    }

    /**
     * Does not return any values but prints a list of the of people in the exclusive program for readability.
     * @author FrankJunkar
     */
    public void printExclusiveRewardsProgramRewardsProgram(){
        // Loops through each person in exlusive rewards program arraylist and prints their name
        for(int i = 0; i < ExclusiveRewardsProgram.length; i++){
            if(ExclusiveRewardsProgram[i] == null){
                break;
            }
            System.out.print(ExclusiveRewardsProgram[i]);
        }
    }

}
