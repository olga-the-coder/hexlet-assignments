package exercise;


// BEGIN
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {
    public static List<String> validate(Address address) {
        List<String> notValidFields = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field: fields) {
            try {
                field.setAccessible(true);
                if (field.isAnnotationPresent(NotNull.class)) {
                    Object value = field.get(address);
                    if (value == null) {
                        notValidFields.add(field.getName());
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return notValidFields;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> notValidFieldsAdvanced = new HashMap<>();

        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field: fields) {
            try {
                field.setAccessible(true);
                if (field.isAnnotationPresent(NotNull.class)) {
                    Object value = field.get(address);
                    if (value == null) {
                        notValidFieldsAdvanced.put(field.getName(), List.of("can not be null"));
                    }
                }
                if (field.isAnnotationPresent(MinLength.class)) {
                    Object value = field.get(address);
                    MinLength minLengthInfo = field.getAnnotation(MinLength.class);
                    int numberLetters = minLengthInfo.minLength();
                    int valueLength = (String.valueOf(value)).length();
                    if (valueLength < numberLetters) {
                        notValidFieldsAdvanced.put(field.getName(), List.of("length less than " + numberLetters));
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return notValidFieldsAdvanced;
    }
}
// END
