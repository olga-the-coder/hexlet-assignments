package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String s;

    public ReversedSequence(String s) {
        this.s = s;
    }

    public int length() {
        return s.length();
    }

    private int fromEnd(int i) {
        return s.length() - 1 - i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.s);
        return sb.reverse().toString();
    }

    public char charAt(int i) {
        if ((i < 0) || (i > this.s.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return s.charAt(fromEnd(i));
    }

    public StringBuilder subSequence(int start, int end) {
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        } else if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        } else if (end > this.s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        } else {
            StringBuilder sb = new StringBuilder(s.subSequence(fromEnd(end) + 1, fromEnd(start) + 1));
            return sb.reverse();
        }
    }
}
// END
