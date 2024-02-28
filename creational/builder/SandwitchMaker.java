package creational.builder;

public class SandwitchMaker {

    private SandwitchBuilder sandwitchBuilder;

    public SandwitchMaker(SandwitchBuilder sandwitchBuilder) {
        this.sandwitchBuilder = sandwitchBuilder;
    }

    public void makeSandwitch() {
        sandwitchBuilder.bread("Wheat");
        sandwitchBuilder.cheese("Swiss");
        sandwitchBuilder.meat("Turkey");
        sandwitchBuilder.veggies("Lettuce");
        sandwitchBuilder.sauce("Mayo");
    }

}
