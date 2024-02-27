package creational.factorymethod;
import creational.factorymethod.Kitchen;

public class Client {

    public static void main(String[] args) {

        MenuItem pizza = Kitchen.createMenuItem("Pizza");
        pizza.getDetails();
        MenuItem pasta = Kitchen.createMenuItem("Pasta");
        pasta.getDetails();
        MenuItem burger = Kitchen.createMenuItem("Burger");
        burger.getDetails();

    }
}
