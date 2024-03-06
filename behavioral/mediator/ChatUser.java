package behavioral.mediator;

public class ChatUser implements User{

    private ChatMediator mediator;
    private String name;

    public ChatUser(ChatMediator mediator, String name){
        this.mediator=mediator;
        this.name=name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }
    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " Received " + message);
    }
}
