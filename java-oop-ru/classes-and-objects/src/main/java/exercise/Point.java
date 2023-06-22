package exercise;

// BEGIN
public class Point {
    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public void setX(int dotX) {
        this.pointX = dotX;
    }
    public int getX() {
        return pointX;
    }

    public void setY(int dotY) {
        this.pointY = dotY;
    }

    public int getY() {
        return pointY;
    }
}

// END
