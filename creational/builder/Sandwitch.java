package creational.builder;

public class Sandwitch {

        private String bread;
        private String cheese;
        private String meat;
        private String veggies;
        private String sauce;

        public void setBread(String bread) {
            this.bread = bread;
        }

        public void setCheese(String cheese) {
            this.cheese = cheese;
        }

        public void setMeat(String meat) {
            this.meat = meat;
        }

        public void setVeggies(String veggies) {
            this.veggies = veggies;
        }

        public void setSauce(String sauce) {
            this.sauce = sauce;
        }


        public void getDetails() {
            System.out.println("Sandwitch [bread=" + bread + ", cheese=" + cheese + ", meat=" + meat + ", veggies=" + veggies + ", sauce=" + sauce + "]");
        }
}
