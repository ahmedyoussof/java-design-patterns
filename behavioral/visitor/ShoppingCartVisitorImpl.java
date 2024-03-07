package behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

    @Override
    public double visit(Item item) {
        double cost = 0;
        cost = item.getPrice();
        System.out.println("Item cost = " + cost);
        return cost;
    }

    @Override
    public double visit(Book book) {
        double cost = 0;
        cost = book.getPrice();
        if(cost > 50){
            cost = cost - 5;
        }
        System.out.println("Book cost = " + cost);
        return cost;
    }

    @Override
    public double visit(Fruit fruit) {
        double cost = 0;
        cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit cost = " + cost);
        return cost;
    }
}
