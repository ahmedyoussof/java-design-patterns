package structural.composite;

public class ImageEditor {

    private Graphics graphics;

    private CompoundShape allShapes = new CompoundShape();

    public ImageEditor(Graphics graphics) {
        this.graphics = graphics;

    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
    }

    public void drawShapes() {
        allShapes.paint(graphics);
    }
}
