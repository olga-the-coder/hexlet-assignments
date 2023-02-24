package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> mapOfWords = new HashMap<String, Integer>();
        if ((sentence == null  && sentence.isEmpty()) || sentence == "") {
            return Collections.emptyMap();
        }

        String[] sentenceLowCaseArray = sentence.toLowerCase().split(" ");
        for (String word: sentenceLowCaseArray) {
            if (mapOfWords.containsKey(word)) {
                mapOfWords.put(word, mapOfWords.get(word) + 1);
            } else {
                mapOfWords.put(word, 1);
            }
        }
        return mapOfWords;
    }
    public static String toString(Map<String, Integer> wordCountDictionary) {
        if (wordCountDictionary.isEmpty()) {
            return "{}";
        } else {
            var result = new StringBuilder();
            result.append("{\n");
            for (String key : wordCountDictionary.keySet()) {
                result.append("  " + key + ": " + wordCountDictionary.get(key) + "\n");
            }
            result.append("}\n");
            return result.toString();
        }
    }
}
//END
