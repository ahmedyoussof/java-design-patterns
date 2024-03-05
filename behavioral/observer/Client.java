package behavioral.observer;

public class Client {

    public static void main(String[] args) {
        StockMarket stockMarket = new ConcreteStockMarket();
        StockObserver investor1 = new Investor("Investor 1");
        StockObserver investor2 = new Investor("Investor 2");
        StockObserver investor3 = new Investor("Investor 3");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);
        stockMarket.registerObserver(investor3);
        System.out.println("=================================================");
        stockMarket.notifyObservers("GOOG", 1000);
        stockMarket.notifyObservers("AAPL", 2000);
        stockMarket.notifyObservers("MSFT", 3000);
        System.out.println("=================================================");
        stockMarket.removeObserver(investor1);
        System.out.println("=================================================");
        stockMarket.notifyObservers("GOOG", 1100);
        stockMarket.notifyObservers("AAPL", 2100);
        stockMarket.notifyObservers("MSFT", 3100);
        System.out.println("=================================================");
        stockMarket.changeStockPrice("GOOG", 1200);
    }
}
