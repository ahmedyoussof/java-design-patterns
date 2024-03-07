package behavioral.template;

public class Client {

    public static void main(String[] args) {
        CoffeeMaker espressoCoffeeMaker = new EspressoCoffeeMaker();
        espressoCoffeeMaker.makeCoffee();

        CoffeeMaker latteCoffeeMaker = new LatteCoffeeMaker();
        latteCoffeeMaker.makeCoffee();
    }
}
