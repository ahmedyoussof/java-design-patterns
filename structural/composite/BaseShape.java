package structural.composite;

public class BaseShape implements Shape{

    private int x;
    private int y;
    private String color;

    public BaseShape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public String getColor() {
        return color;
    }


    @Override
    public void paint(Graphics graphics) {
        System.out.println("Painting shape");
    }
}
