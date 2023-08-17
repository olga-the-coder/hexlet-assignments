package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> listBooks, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        if (listBooks.isEmpty() || where.isEmpty() || (listBooks.size() == 0) || where == null) {
            return List.of();
        } else {
            for (Map<String, String> book : listBooks) {
                if (book.entrySet().containsAll(where.entrySet())) {
                    result.add(book);
                }
            }
            return result;
        }
    }
}
//END
