package creational.abastractfactory;

public class Pickup implements Shipping{
    @Override
    public void getShipping() {
        System.out.println("Order will be picked up by customer");
    }
}
