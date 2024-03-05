package behavioral.observer;

public interface StockMarket {

    void registerObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers(String stockSymbol, double stockPrice);
    void changeStockPrice(String stockSymbol, double stockPrice);
}
