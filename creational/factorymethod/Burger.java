package creational.factorymethod;

public class Burger implements MenuItem {


    @Override
    public void getDetails() {
        System.out.println("Name: Burger, Description: this is Burger, Price: 10");
    }
}
