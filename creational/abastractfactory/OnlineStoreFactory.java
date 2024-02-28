package creational.abastractfactory;

public class OnlineStoreFactory extends StoreFactory{

    public OnlineStoreFactory() {
        System.out.println("Creating online store factory");
    }
        @Override
        PaymentMethod createPaymentMethod(String paymentType) {
            return switch (paymentType) {
                case "card" -> new CreditCard();
                case "paypal" -> new Paypal();
                case "stripe" -> new Stripe();
                default -> throw new IllegalArgumentException("Invalid payment type");
            };
        }

        @Override
        Shipping createShipping(String shippingType) {
            return switch (shippingType) {
                case "express" -> new ExpressShipping();
                case "standard" -> new StandardShipping();
                default -> throw new IllegalArgumentException("Invalid shipping type");
            };
        }
}
