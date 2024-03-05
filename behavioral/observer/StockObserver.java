package behavioral.observer;

public interface StockObserver {

    void update(String stockSymbol, double stockPrice);
}
