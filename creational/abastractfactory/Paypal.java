package creational.abastractfactory;

public class Paypal implements PaymentMethod{

        @Override
        public void processPayment(int amount) {
            System.out.println("processing " + amount + "$" + " using Paypal payment");
        }
}
