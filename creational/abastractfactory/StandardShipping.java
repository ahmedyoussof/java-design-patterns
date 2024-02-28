package creational.abastractfactory;

public class StandardShipping implements Shipping{
    @Override
    public void getShipping() {
        System.out.println("Order will be shipped by Standard shipping");
    }
}
