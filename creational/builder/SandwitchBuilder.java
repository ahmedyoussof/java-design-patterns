package creational.builder;

public interface SandwitchBuilder {

    void bread(String bread);
    void cheese(String cheese);
    void meat(String meat);
    void veggies(String veggies);
    void sauce(String sauce);
    Sandwitch build();

}
