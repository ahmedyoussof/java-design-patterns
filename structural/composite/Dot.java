package structural.composite;

public class Dot extends BaseShape{
    private final int DOT_SIZE = 3;

    public Dot(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawDot(getX(), getY());
    }
}
