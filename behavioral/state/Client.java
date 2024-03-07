package behavioral.state;

public class Client {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.request();
        fan.request();
        fan.request();
        fan.request();

    }
}
