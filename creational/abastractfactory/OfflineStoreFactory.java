package creational.abastractfactory;


public class OfflineStoreFactory extends StoreFactory{

        public OfflineStoreFactory() {

            System.out.println("Offline store factory created");
        }

        @Override
        PaymentMethod createPaymentMethod(String paymentType) {
            return switch (paymentType) {
                case "card" -> new CreditCard();
                case "cash" -> new CashOnDelivery();
                default -> throw new IllegalArgumentException("Invalid payment type");
            };
        }

        @Override
        Shipping createShipping(String shippingType) {
            if("pickup".equals(shippingType)) {
                return new Pickup();
            } else {
                throw new IllegalArgumentException("Invalid shipping type");
            }
        }
}
