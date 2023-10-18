package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class App {

    // BEGIN
    public static void save(Path filePath, Car car)  throws Exception {
        String jsonRepresentation = car.serialize();
        Files.writeString(filePath, jsonRepresentation, StandardOpenOption.WRITE);
    }

    public static Car extract(Path filePath) throws Exception {
        String jsonRepresentation = Files.readString(filePath);
        Car car = Car.unserialize(jsonRepresentation);
        return car;
    }

// END
}
