package structural.proxy;


public class RealImage implements Image {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading  from disk " + imageName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + imageName);
    }
}
