package creational.abastractfactory;

public class Stripe implements PaymentMethod{

        @Override
        public void processPayment(int amount) {
            System.out.println("processing " + amount + "$" + " using Stripe payment");
        }
}
