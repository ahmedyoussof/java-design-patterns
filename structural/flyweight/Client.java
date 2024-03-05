package structural.flyweight;

public class Client {

    public static void main(String[] args) {

        GameObjectFactory gameObjectFactory = new GameObjectFactory();
        GameObject board = gameObjectFactory.getGameObject("chess");
        GameObject tree = gameObjectFactory.getGameObject("Tree");
        GameObject board2 = gameObjectFactory.getGameObject("Checkers");

        board.render("Player 1");
        tree.render("Player 2");
        board2.render("Player 3");

    }
}
