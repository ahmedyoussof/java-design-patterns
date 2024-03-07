package behavioral.state;

public class Fan {
    private FanState currentState;

    public Fan() {
        this.currentState = new OffState();
    }

    public void setState(FanState fanState) {
        this.currentState = fanState;
    }

    public void request() {
        currentState.handleRequest(this);
    }
}
