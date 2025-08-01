package flyweightfactoryp;

// Concrete Flyweight sınıfı
class ConcreteCharacter implements Character {
    private char symbol; // Intrinsic durum
    private String font; // Intrinsic durum

    public ConcreteCharacter(char symbol, String font) {
        this.symbol = symbol;
        this.font = font;
    }

    @Override
    public void display(int positionX, int positionY) {
        System.out.println("Karakter: " + symbol + ", Font: " + font + ", Konum: (" + positionX + "," + positionY + ")");
    }
}
