package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> storage;

    public InMemoryKV(Map<String, String> storage) {
        this.storage = new HashMap<>(storage);
    }

    public void set(String key, String value) {
        this.storage.put(key, value);
    }

    public void unset(String key) {
        this.storage.remove(key);
    }

    public String get(String key, String defaultValue) {
        return this.storage.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        Map<String, String> shallowCopy = new HashMap<String, String>();
        Set<Map.Entry<String, String>> entries = storage.entrySet();
        for (Map.Entry<String, String> mapEntry : entries) {
            shallowCopy.put(mapEntry.getKey(), mapEntry.getValue());
        }
        return shallowCopy;
    }
}
// END
