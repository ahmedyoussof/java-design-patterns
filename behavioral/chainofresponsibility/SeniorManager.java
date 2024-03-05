package behavioral.chainofresponsibility;

public class SeniorManager extends RequestHandler{

    public SeniorManager() {
        super("Senior manager");
    }

    @Override
    void setNextHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    @Override
    void approve(int requestId) {
        if(requestId > 10 && requestId <= 20) {
            System.out.println("Request " + requestId + " approved by " + this.name);
        } else {
            super.approve(requestId);
        }
    }
}
