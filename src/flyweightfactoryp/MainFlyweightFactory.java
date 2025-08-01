package flyweightfactoryp;

public class MainFlyweightFactory {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // Aynı karakter ve font için aynı nesneyi paylaş
        Character char1 = factory.getCharacter('A', "Arial");
        char1.display(10, 20);

        Character char2 = factory.getCharacter('A', "Arial");
        char2.display(30, 40);

        Character char3 = factory.getCharacter('B', "Times New Roman");
        char3.display(50, 60);

        // Aynı 'A' karakteri için aynı nesne kullanılır
        System.out.println("char1 ve char2 aynı nesne mi? " + (char1 == char2)); // true
        System.out.println("char1 ve char3 aynı nesne mi? " + (char1 == char3)); // false
    }
}
