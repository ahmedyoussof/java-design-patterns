package structural.flyweight;

public class Board implements GameObject{

    private String type;

    public Board(String type) {
        this.type = type;
    }

    @Override
    public void render(String player) {
        System.out.println("Rendering " + type + " for " + player);
    }
}
