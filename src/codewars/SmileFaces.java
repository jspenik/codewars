package codewars;

import java.util.List;
import java.util.regex.Pattern;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }

        return (int) arr.stream().filter(str -> Pattern.matches("[:;][-~]?[)D]", str)).count();
    }
}
