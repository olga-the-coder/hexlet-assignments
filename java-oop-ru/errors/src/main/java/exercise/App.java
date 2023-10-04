package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            double areaCircle = circle.getSquare();
            int areaCircleInt = (int) Math.round(areaCircle);
            System.out.println(areaCircleInt);
        } catch (NegativeRadiusException exception) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
