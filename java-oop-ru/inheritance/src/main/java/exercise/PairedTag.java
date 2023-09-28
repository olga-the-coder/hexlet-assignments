package exercise;

import java.util.Map;
import java.util.List;
//import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> childTags;

    public PairedTag(String tagName, Map<String, String> tagAttributes, String tagBody, List<Tag> childTags) {
        super(tagName, tagAttributes);
        this.tagBody = tagBody;
        this.childTags = childTags;
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
        tag.append(tagBody);
        for (Tag child: childTags) {
            tag.append(child.toString());
        }
        tag.append("</");
        tag.append(tagName);
        tag.append(">");
        return tag.toString();
    }
}
// END
