package creational.builder;

public class VegieSandwitchBuilder implements SandwitchBuilder {

        private Sandwitch sandwitch;

        public VegieSandwitchBuilder() {
            this.sandwitch = new Sandwitch();
        }

        @Override
        public void bread(String bread) {
            sandwitch.setBread(bread);
        }

        @Override
        public void cheese(String cheese) {
            sandwitch.setCheese(cheese);
        }

        @Override
        public void meat(String meat) {
            sandwitch.setMeat(meat);
        }

        @Override
        public void veggies(String veggies) {
            sandwitch.setVeggies(veggies);
        }

        @Override
        public void sauce(String sauce) {
            sandwitch.setSauce(sauce);
        }

        @Override
        public Sandwitch build() {
            return sandwitch;
        }

}
