package creational.factorymethod;

public class Pizza implements MenuItem {

    @Override
    public void getDetails() {
        System.out.println("Name: Pizza, Description: this is Pizza, Price: 30");
    }

}
