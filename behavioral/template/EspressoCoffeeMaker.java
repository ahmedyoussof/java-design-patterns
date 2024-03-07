package behavioral.template;

public class EspressoCoffeeMaker extends CoffeeMaker {

    public EspressoCoffeeMaker() {
        System.out.println("Making espresso ...");
    }

    @Override
    protected void brewCoffee() {
        System.out.println("Brewing espresso ...");
    }

    @Override
    protected void addMilk() {
        // Do nothing
    }

    @Override
    protected boolean customerWantsMilk() {
        return false;
    }
}
