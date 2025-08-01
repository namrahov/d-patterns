package virtualproxyp;

public class MainVirtualProxy {
    public static void main(String[] args) {
        // Proxy nesnesi oluşturuluyor, ancak gerçek görüntü henüz yüklenmedi
        Image image = new ImageProxy("test_image.jpg");

        // İlk çağrıda görüntü yüklenir ve gösterilir
        System.out.println("First call to display:");
        image.display();

        // İkinci çağrıda görüntü zaten yüklü olduğu için tekrar yüklenmez
        System.out.println("\nSecond call to display:");
        image.display();
    }
}
