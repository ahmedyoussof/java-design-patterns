package structural.decorator;

public class SugarDecorator extends CoffeeDecorator{

        public SugarDecorator(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " with Sugar";
        }

        @Override
        public double getCost() {
            return super.getCost() + 0.5;
        }
}
