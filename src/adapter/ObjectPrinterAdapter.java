package adapter;

// Object Adapter
public class ObjectPrinterAdapter implements ModernPrinter {
    private LegacyPrinter legacyPrinter;  // Kompozisyon ile adaptee tutulur

    public ObjectPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printDocument(String content) {
        // Uyumsuz metodu çağırarak dönüştür
        legacyPrinter.printOldStyle(content + " (Adapted)");
    }
}
