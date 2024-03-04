package structural.composite;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    String getColor();
    void paint(Graphics graphics);
}
