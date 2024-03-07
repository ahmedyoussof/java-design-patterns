package behavioral.template;

public class LatteCoffeeMaker extends CoffeeMaker{

    public LatteCoffeeMaker() {
        System.out.println("Making latte ...");
    }

    @Override
    protected void brewCoffee() {
        System.out.println("Brewing coffee with added flavor ...");
    }

    @Override
    protected void addMilk() {
        System.out.println("Adding steamed milk ...");
    }

}
