public class StoreTester {
    public static void main(String[] args) {
        // Creates new supermarket called Target and adds a bunch of different items to inventory
        SuperMarket Target = new SuperMarket("Target");
        Target.addItem("Apple");
        Target.addItem("Phone");
        Target.addItem("Banana");
        Target.addItem("Clothes");
        Target.addItem("Dog Food");
        Target.addItem("Soap");
        Target.addItem("Snacks");

        // Creates new customer called James and has him purchase something (with user input)
        Customer James = new Customer("James", "james@gmail.com");
        James.purchaseItem(Target);
        
        // Prints everything in James's bag ( aka what James just bought)
        System.out.println(James.getBagItems());
        
        // Adds James to Target's general rewards program, prints everyone in that program
        Target.addToGeneral(James);
        System.out.println(Target.getGeneralRewardsProgram());
        
        // Adds James to Target's exclusive rewards program, prints everyone in that program
        Target.addToExclusive(James);
        Target.printExclusiveRewardsProgramRewardsProgram();

    }
}
