package behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        RequestHandler manager = new Manager();
        RequestHandler director = new Director();
        RequestHandler seniorManager = new SeniorManager();

        manager.setNextHandler(director);
        director.setNextHandler(seniorManager);

        manager.approve(5);
        manager.approve(15);
        manager.approve(25);
        manager.approve(35);
    }
}
