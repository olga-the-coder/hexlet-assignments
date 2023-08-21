package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailList) {
        List<String> freeDomains = Arrays.asList("@gmail.com", "@yandex.ru", "@hotmail.com");

        if (emailList != null) {
            return emailList.stream()
                    .filter(email -> freeDomains.stream().anyMatch(suffix -> email.endsWith(suffix)))
                    .count();
        } else {
            return 0;
        }
    }
}
// END
