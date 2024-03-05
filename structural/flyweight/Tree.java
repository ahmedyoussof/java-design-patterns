package structural.flyweight;

public class Tree implements GameObject{

    private String type;

    public Tree(String type) {
        this.type = type;
    }

    @Override
    public void render(String player) {
        System.out.println("Rendering " + type + " for " + player);
    }
}
