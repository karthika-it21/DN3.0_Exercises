public class ImageViewerTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk
        image1.display();
        System.out.println();

        // Image will not be loaded from disk
        image1.display();
        System.out.println();

        // Image will be loaded from disk
        image2.display();
    }
}
