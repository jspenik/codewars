package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TripleDouble {

    public static int TripleDouble(long num1, long num2) {

        for (int i = 0; i <= 9; i++) {
            if (hasNumberOf(num1, i, 3) && hasNumberOf(num2, i, 2)) {
                return 1;
            }
        }

        return 0;
    }

    private static boolean hasNumberOf(long num, int current, int length) {
        String str = IntStream.range(0, length).boxed().map(i -> current).map(String::valueOf).collect(Collectors.joining());

        return String.valueOf(num).contains(str);
    }
}
