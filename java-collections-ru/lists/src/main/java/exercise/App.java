package exercise;

//import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
public class App {
    public static boolean scrabble(String setOfLetters, String word) {
        if (setOfLetters.equals(null) || setOfLetters.equals("")) {
            return false;
        }

        char[] wordArray = word.toLowerCase().toCharArray();
        char[] charLetters = setOfLetters.toCharArray();

        ArrayList<Character> listCharacters = new ArrayList<>();

        for (char letter: charLetters) {
            Character character = Character.valueOf(letter);
            listCharacters.add(character);
        }

        int count = 0;

        for (char character: wordArray) {
            if (listCharacters.indexOf(character) >= 0) {
                listCharacters.remove(Character.valueOf(character));
                count++;
            }
        }

        if (count == wordArray.length) {
            return true;
        }
        return false;
    }
}
//END
