package behavioral.observer;

public class Investor implements StockObserver{

        private String name;

        public Investor(String name) {
            this.name = name;
        }

        @Override
        public void update(String stockSymbol, double stockPrice) {
            System.out.println(name + " received update for " + stockSymbol + " price: $" + stockPrice);
        }
}
