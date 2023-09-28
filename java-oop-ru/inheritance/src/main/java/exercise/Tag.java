package exercise;

//import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    protected String tagName;
    protected Map<String, String> tagAttributes;

    public Tag() {
    };

    public Tag(String tagName, Map<String, String> tagAttributes) {
        this.tagName = tagName;
        this.tagAttributes = tagAttributes;
    }

    public abstract String toString();

}

// END
