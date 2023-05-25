public class StoreTester {
    public static void main(String[] args) {
        SuperMarket Target = new SuperMarket("Target");
        Target.addItem("Apple");
        Target.addItem("Phone");
        Target.addItem("Banana");
        Target.addItem("Clothes");
        Target.addItem("Dog Food");
        Target.addItem("Soap");
        Target.addItem("Snacks");


        Customer James = new Customer("James", "james@gmail.com");
        James.purchaseItem(Target);

        System.out.println(James.getBagItems());

        Target.addToGeneral(James);
        System.out.println(Target.getGeneralRewardsProgram());

        Target.addToExclusive(James);
        Target.printExclusiveRewardsProgramRewardsProgram();

    }
}
