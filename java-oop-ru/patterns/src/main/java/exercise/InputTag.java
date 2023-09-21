package exercise;

// BEGIN
public class InputTag  implements TagInterface {
    private String type;
    private String value;

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String render() {
        var result = new StringBuilder();
        result.append("<input type=\"");
        result.append(type);
        result.append("\" value=\"");
        result.append(value);
        result.append("\">");
        return result.toString();
    }
}
// END
