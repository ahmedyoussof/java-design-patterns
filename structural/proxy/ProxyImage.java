package structural.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageName;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("First Time loading of " + imageName);
            realImage = new RealImage(imageName);
        } else {
            System.out.println("Already loaded " + imageName);
        }
        realImage.display();
    }

}
