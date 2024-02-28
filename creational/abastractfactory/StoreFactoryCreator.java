package creational.abastractfactory;

public class StoreFactoryCreator {
    static StoreFactory getFactory(String factoryType){

        return switch (factoryType) {
            case "online" -> new OnlineStoreFactory();
            case "offline" -> new OfflineStoreFactory();
            default -> throw new IllegalArgumentException("Invalid factory type");
        };
    }
}
