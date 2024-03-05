package behavioral.chainofresponsibility;

public class Manager extends RequestHandler{

    public Manager() {
        super("Manager");
    }

    @Override
    void setNextHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    @Override
    void approve(int requestId) {
        if(requestId <= 10) {
            System.out.println("Request " + requestId + " approved by " + this.name);
        } else {
            super.approve(requestId);
        }
    }
}
