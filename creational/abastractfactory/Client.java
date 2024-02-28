package creational.abastractfactory;

public class Client {

    public static void main(String[] args) {
        StoreFactory onlineStore = StoreFactoryCreator.getFactory("online");
        PaymentMethod paymentMethod = onlineStore.createPaymentMethod("stripe");
        paymentMethod.processPayment(20);
        Shipping shipping = onlineStore.createShipping("express");
        shipping.getShipping();

        StoreFactory offlineStore = StoreFactoryCreator.getFactory("offline");
        PaymentMethod paymentMethodOffline = offlineStore.createPaymentMethod("cash");
        paymentMethodOffline.processPayment(20);
        Shipping shippingOffline = offlineStore.createShipping("pickup");
        shippingOffline.getShipping();
    }
}
