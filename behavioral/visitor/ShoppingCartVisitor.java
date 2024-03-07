package behavioral.visitor;

public interface ShoppingCartVisitor {
    double visit(Item item);
    double visit(Book book);
    double visit(Fruit fruit);
}
