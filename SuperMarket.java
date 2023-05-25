import java.util.ArrayList;

public class SuperMarket extends Store{

    private ArrayList<Customer> GeneralRewardsProgram = new ArrayList<Customer>();
    private Customer[] ExclusiveRewardsProgram = new Customer[20];

    public SuperMarket(String name){
        super(name);
    }

    /**
     * Adds a customer to the general rewards program with no limit
     * @param cust
     */
    public void addToGeneral(Customer cust){
        GeneralRewardsProgram.add(cust);
    }

    /**
     * The program first checks if there are any unfilled or null values in the array and if there is none, then it will
     * add the customer to the array. If the array is filled, then the program will find the customer with the lowest
     * purchases in the array and replace them with the new customer given the new customer has more purchases.
     * @param cust
     */
    public void addToExclusive(Customer cust){
        boolean flag = true;
        for(int i =0; i < ExclusiveRewardsProgram.length; i++){
            if(ExclusiveRewardsProgram[i] == null){
                ExclusiveRewardsProgram[i] = cust;
                flag = false;
                break;
            }
        }
        if(flag){
            int lowest = Integer.MAX_VALUE;
            int index = 0;
            for(int j = 0; j < ExclusiveRewardsProgram.length; j++){
                if(ExclusiveRewardsProgram[j].getPurchases() < lowest){
                    lowest = ExclusiveRewardsProgram[j].getPurchases();
                    index = j;
                }
            }
            if(cust.getPurchases() >= lowest){
                ExclusiveRewardsProgram[index] = cust;
            }
        }
    }

    /**
     * returns a list of the people in the general rewards program
     * @return
     */
    public ArrayList<Customer> getGeneralRewardsProgram(){
        return GeneralRewardsProgram;
    }

    /**
     * Does not return any values but prints a list of the of people in the exclusive program for readability.
     */
    public void printExclusiveRewardsProgramRewardsProgram(){
        for(int i = 0; i < ExclusiveRewardsProgram.length; i++){
            if(ExclusiveRewardsProgram[i] == null){
                break;
            }
            System.out.print(ExclusiveRewardsProgram[i]);
        }
    }

}
