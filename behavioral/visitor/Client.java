package behavioral.visitor;

public class Client {

    public static void main(String[] args) {
        ShoppingCartElement[] items = new ShoppingCartElement[]{
            new Item("Pen", 10),
            new Book("1234", 20),
            new Fruit("Banana", 5, 2),
        };

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double total = 0;
        for(ShoppingCartElement item : items){
            total = total + item.accept(visitor);
        }
        System.out.println("Total Cost = " + total);
    }
}
