package adapter;

public class MainAdapter {
    public static void main(String[] args) {
        LegacyPrinter oldPrinter = new LegacyPrinter();
        ModernPrinter adapter = new ObjectPrinterAdapter(oldPrinter);
        adapter.printDocument("Hello World");  // Çıktı: Legacy Printer: HELLO WORLD (ADAPTED)
    }
}
