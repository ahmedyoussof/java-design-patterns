package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStockMarket implements StockMarket{

    private List<StockObserver> observers = new ArrayList<>();

    public ConcreteStockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol, double stockPrice) {
        for(StockObserver observer : observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }

    @Override
    public void changeStockPrice(String stockSymbol, double stockPrice) {
        notifyObservers(stockSymbol, stockPrice);
    }
}
