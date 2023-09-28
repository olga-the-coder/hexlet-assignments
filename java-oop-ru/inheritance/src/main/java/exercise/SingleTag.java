package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> tagAttributes) {
        super(tagName, tagAttributes);
    }

    public String toString() {
        var tag = new StringBuilder();
        tag.append("<");
        tag.append(tagName + " ");
        for (Map.Entry<String, String> entry: tagAttributes.entrySet()) {
            tag.append(entry.getKey() + "=\"");
            tag.append(entry.getValue() + "\" ");
        }
        tag.deleteCharAt(tag.length() - 1);
        tag.append(">");
        return tag.toString();
    }
}
// END
