package creational.builder;

public class Client {

    public static void main(String[] args) {

        SandwitchBuilder builder = new VegieSandwitchBuilder();
        SandwitchMaker sandwitchMaker = new SandwitchMaker(builder);
        sandwitchMaker.makeSandwitch();
        Sandwitch sandwitch = builder.build();
        sandwitch.getDetails();
    }
}
