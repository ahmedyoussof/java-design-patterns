package behavioral.state;

public class HighState implements FanState {

    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Turning fan off.");
        fan.setState(new OffState());
    }

    @Override
    public String toString() {
        return "Fan is on high.";
    }
}
