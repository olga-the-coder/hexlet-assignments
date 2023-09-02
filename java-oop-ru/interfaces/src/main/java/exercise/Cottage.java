package exercise;

// BEGIN
public class Cottage implements Home, Comparable<Home> {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public int getFloorCount() {
        return this.floorCount;
    }

    @Override
    public int compareTo() {
        return 0;
    }
    @Override
    public String toString() {
        String descriptionCottage = getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
        return descriptionCottage;
    }

    @Override
    public int compareTo(Home o) {
        return Double.compare(area, o.getArea());
    }
}

// END
