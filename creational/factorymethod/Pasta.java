package creational.factorymethod;

public class Pasta implements MenuItem {



    @Override
    public void getDetails() {
        System.out.println("Name: Pasta, Description: this is Pasta, Price: 20");
    }
}
