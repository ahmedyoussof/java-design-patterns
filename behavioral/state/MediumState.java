package behavioral.state;

public class MediumState implements FanState {

    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Turning fan on to high.");
        fan.setState(new HighState());
    }

    @Override
    public String toString() {
        return "Fan is on medium.";
    }
}
