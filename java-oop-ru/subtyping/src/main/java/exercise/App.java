package exercise;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        //Map<String, String> swappedStorage = new HashMap<>();

        for (String key: storage.toMap().keySet()) {
            storage.set(storage.toMap().get(key), key);
            storage.unset(key);
        }
    }
}
// END
