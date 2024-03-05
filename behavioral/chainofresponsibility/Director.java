package behavioral.chainofresponsibility;

public class Director extends RequestHandler{

    public Director() {
        super("Director");
    }

    @Override
    void setNextHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    @Override
    void approve(int requestId) {
        if(requestId > 20 && requestId <= 30) {
            System.out.println("Request " + requestId + " approved by " + this.name);
        } else {
            super.approve(requestId);
        }
    }
}
