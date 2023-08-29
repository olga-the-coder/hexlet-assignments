package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String content) {
        return Stream.of(content.split("\\s+"))
                .filter(word -> word.startsWith("environment"))
                .map(word -> word.split("[,\"]"))
                .flatMap(Arrays::stream)
                .filter(fWord -> fWord.startsWith("X_FORWARDED_"))
                .map(fWord -> fWord.substring(12))
                .collect(Collectors.joining(","));
    }
}
//END
