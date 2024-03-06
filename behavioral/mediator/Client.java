package behavioral.mediator;


public class Client {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();
        User user1 = new ChatUser(mediator, "Pankaj");
        User user2 = new ChatUser(mediator, "Lisa");
        User user3 = new ChatUser(mediator, "Saurabh");
        User user4 = new ChatUser(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessage("Hi All");
        System.out.println("===================================");
        user2.sendMessage("Hi Everyone");
        System.out.println("===================================");
        user3.sendMessage("Hello all");
        System.out.println("===================================");
        user4.sendMessage("Hello guys");
    }
}
