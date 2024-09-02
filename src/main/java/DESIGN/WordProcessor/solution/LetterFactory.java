package DESIGN.WordProcessor.solution;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    public static Map<Character, ILetter> characterCache = new HashMap<>();

    public static ILetter createLetter(Character charValue){
        if(characterCache.containsKey(charValue)){
            return characterCache.get(charValue);
        }
        else {
            DocumentCharacter charObj= new DocumentCharacter(charValue, "Arial", 10);
            characterCache.put(charValue, charObj);
            return charObj;
        }
    }
}
