package composite;

public class MainComposite {
    public static void main(String[] args) {
        // Leaf nesneleri (dosyalar)
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");

        // Composite nesnesi (klasör)
        Folder folder1 = new Folder("Documents");
        Folder folder2 = new Folder("Downloads");

        // Hiyerarşi oluşturma
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);
        folder1.addComponent(folder2); // Klasör içinde klasör

        // Detayları gösterme
        folder1.showDetails();
    }
}
