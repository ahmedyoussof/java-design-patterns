package behavioral.template;

public abstract class CoffeeMaker {

    public void makeCoffee() {
        boilWater();
        brewCoffee();
        pourInCup();
        if(customerWantsMilk()) {
            addMilk();
        }
        addSugar();
    }

    private void boilWater() {
        System.out.println("Boiling water ...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup ...");
    }

    private void addSugar() {
        System.out.println("Adding sugar ...");
    }

    protected abstract void brewCoffee();

    protected abstract void addMilk();

    protected boolean customerWantsMilk() {
        return true;
    }
}
