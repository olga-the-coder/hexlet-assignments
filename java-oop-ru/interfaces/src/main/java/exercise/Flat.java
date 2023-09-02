package exercise;

// BEGIN
public class Flat implements Home, Comparable<Home> {
    private double area;
    private double balconyArea;
    private int floor;
    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public double getArea() {
        return (this.area + this.balconyArea);
    }

    @Override
    public int compareTo() {
        return 0;
    }

    @Override
    public String toString() {
        String descriptionFlat = "Квартира площадью " + getArea() + " метров на " + this.floor + " этаже";
        return descriptionFlat;
    }

    @Override
    public int compareTo(Home o) {
        return Double.compare((area + balconyArea), o.getArea());
    }
}

// END
