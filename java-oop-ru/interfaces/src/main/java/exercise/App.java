package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> realEstate, int quantity) {
        return realEstate.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .limit(quantity)
                .map(estate -> estate.toString())
                .collect(Collectors.toList());
    }
}
// END
