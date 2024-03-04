package structural.composite;

public class Graphics {

    public void drawDot(int x, int y) {
        System.out.println("Drawing dot at " + x + ", " + y);
    }

    public void drawCircle(int x, int y, int width, int height, String color) {
        System.out.println("Drawing circle at " + x + ", " + y + " with width " + width + ", height " + height + " and color " + color);
    }

    public void drawRectangle(int x, int y, int width, int height, String color) {
        System.out.println("Drawing rectangle at " + x + ", " + y + " with width " + width + ", height " + height + " and color " + color);
    }
}
