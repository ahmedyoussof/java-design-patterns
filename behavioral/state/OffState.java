package behavioral.state;

public class OffState implements FanState {

        @Override
        public void handleRequest(Fan fan) {
            System.out.println("Turning fan on to low.");
            fan.setState(new LowState());
        }

        @Override
        public String toString() {
            return "Fan is off.";
        }
}
