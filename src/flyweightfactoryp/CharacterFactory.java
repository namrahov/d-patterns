package flyweightfactoryp;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class CharacterFactory {
    private Map<java.lang.Character, ConcreteCharacter> characters = new HashMap<>();

    public Character getCharacter(char symbol, String font) {
        ConcreteCharacter character = characters.get(symbol);
        if (character == null) {
            character = new ConcreteCharacter(symbol, font);
            characters.put(symbol, character);
        }
        return character;
    }
}
