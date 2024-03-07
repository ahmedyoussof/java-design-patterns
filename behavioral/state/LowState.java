package behavioral.state;

public class LowState implements FanState {

    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Turning fan on to medium.");
        fan.setState(new MediumState());
    }

    @Override
    public String toString() {
        return "Fan is on low.";
    }
}
