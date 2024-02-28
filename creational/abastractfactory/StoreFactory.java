package creational.abastractfactory;

public abstract class StoreFactory {

    abstract PaymentMethod createPaymentMethod(String paymentType);
    abstract Shipping createShipping(String shippingType);

}
