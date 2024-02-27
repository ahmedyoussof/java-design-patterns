package creational.factorymethod;

public class Kitchen {

    public static MenuItem createMenuItem(String type) {
        return switch (type) {
            case "Pizza" -> new Pizza();
            case "Pasta" -> new Pasta();
            case "Burger" -> new Burger();
            default -> null;
        };
    }
}
