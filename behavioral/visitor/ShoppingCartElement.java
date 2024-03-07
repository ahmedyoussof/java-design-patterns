package behavioral.visitor;

public interface ShoppingCartElement {
    double accept(ShoppingCartVisitor visitor);
}
