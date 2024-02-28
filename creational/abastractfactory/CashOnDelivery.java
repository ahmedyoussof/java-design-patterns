package creational.abastractfactory;

public class CashOnDelivery implements PaymentMethod{

        @Override
        public void processPayment(int amount) {
            System.out.println("processing " + amount + "$" + " using CashOnDelivery payment");
        }
}
