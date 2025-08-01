package adapter;

// Eski sınıf (adaptee - uyumsuz)
public class LegacyPrinter {
    public void printOldStyle(String text) {
        System.out.println("Legacy Printer: " + text.toUpperCase());
    }
}
