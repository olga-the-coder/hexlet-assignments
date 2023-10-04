package exercise;

// BEGIN
public class Circle {
    private int radius;
    private Point circleCenterPoint;

    public Circle() {
    }

    public Circle(Point circleCenterPoint, int radius) {
        this.radius = radius;
        this.circleCenterPoint = circleCenterPoint;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {
        double areaCircle = 0;
        if (getRadius() >= 0) {
            areaCircle = Math.PI * getRadius() * getRadius();
        } else {
            throw new NegativeRadiusException();
        }
        return areaCircle;
    }
}
// END
