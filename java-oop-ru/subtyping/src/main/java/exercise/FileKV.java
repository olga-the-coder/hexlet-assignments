package exercise;

// BEGIN
import java.util.HashMap;
import java.util.Map;

public class FileKV implements KeyValueStorage {
    private String path;
    private Map<String, String> dateBase;
    public FileKV(String path, Map<String, String> dateBase) {
        this.path = path;
        this.dateBase = new HashMap<>(dateBase);
    }

    public void set(String key, String value) {
        this.dateBase.put(key, value);
        String stringContent = Utils.serialize(this.dateBase);
        Utils.writeFile(this.path, stringContent);
    }
    public void unset(String key) {
        String stringContent = Utils.readFile(this.path);
        dateBase = Utils.unserialize(stringContent);
        dateBase.remove(key);

    }
    public String get(String key, String defaultValue) {
        String stringContent = Utils.readFile(this.path);
        dateBase = Utils.unserialize(stringContent);
        return this.dateBase.getOrDefault(key, defaultValue);
    }
    public Map<String, String> toMap() {
        return new HashMap<>(dateBase);
    }
}
// END
