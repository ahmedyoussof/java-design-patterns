package creational.abastractfactory;

public class CreditCard implements PaymentMethod{

        @Override
        public void processPayment(int amount) {
            System.out.println("processing " + amount + "$" + " using CreditCard payment");
        }
}
