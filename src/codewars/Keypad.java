package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Keypad {

    private final static String[] MAPPING = {
        "1",
        "ABC2",
        "DEF3",
        "GHI4",
        "JKL5",
        "MNO6",
        "PQRS7",
        "TUV8",
        "WXYZ9",
        " 0",
        "*",
        "#"
    };

    public static int presses(String phrase) {
        String all = Arrays.stream(MAPPING).collect(Collectors.joining());

        return phrase.toUpperCase().chars()
                .filter(ch -> all.indexOf(ch) >= 0)
                .map(ch -> (char) ch)
                .map(ch -> {
                    for (String s : MAPPING) {
                        int index = s.indexOf(ch);
                        if (index >= 0) {
                            return index + 1;
                        }
                    }

                    return 0;
                })
                .sum();
    }
}
