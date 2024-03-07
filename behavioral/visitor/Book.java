package behavioral.visitor;

public class Book implements ShoppingCartElement{

    private String isbnNumber;
    private int price;

    public Book(String isbnNumber, int price){
        this.isbnNumber = isbnNumber;
        this.price = price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
