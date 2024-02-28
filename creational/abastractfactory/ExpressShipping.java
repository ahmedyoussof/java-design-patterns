package creational.abastractfactory;

public class ExpressShipping implements Shipping{
    @Override
    public void getShipping() {
        System.out.println("Order will be shipped by Express shipping");
    }
}
