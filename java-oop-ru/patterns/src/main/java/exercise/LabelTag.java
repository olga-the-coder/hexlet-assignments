package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String textLabelTag;
    private TagInterface childTag;

    public LabelTag(String textLabelTag, TagInterface childTag) {
        this.textLabelTag = textLabelTag;
        this.childTag = childTag;
    }
    public String render() {
        var result = new StringBuilder();
        result.append("<label>");
        result.append(textLabelTag);
        result.append(childTag.render());
        result.append("</label>");
        return result.toString();
    }
}
// END
