package behavioral.chainofresponsibility;

public abstract class RequestHandler {

    String name;
    RequestHandler nextHandler;


    protected RequestHandler(String name) {
        this.name = name;
    }

    abstract void setNextHandler(RequestHandler requestHandler);

    void approve(int requestId) {
        if(this.nextHandler != null) {
            this.nextHandler.approve(requestId);
        } else {
            System.out.println("Request cannot be approved");
        }
    }
}
