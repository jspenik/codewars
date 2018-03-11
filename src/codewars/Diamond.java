package codewars;

import java.util.stream.IntStream;

public class Diamond {

    public static String print(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        int shorterLines = n / 2;

        int fullLineNumber = shorterLines + 1;

        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            int lineWidth = fullLineNumber > rowIndex ? rowIndex + shorterLines + 1 : Math.abs(rowIndex - shorterLines - n);
            int nSpaces = Math.abs(shorterLines - rowIndex);
            int nAsterisks = lineWidth - nSpaces;

            IntStream.range(0, nSpaces)
                    .map(i -> ' ').collect(() -> result, StringBuilder::appendCodePoint, StringBuilder::append);
            IntStream.range(0, nAsterisks)
                    .map(i -> '*').collect(() -> result, StringBuilder::appendCodePoint, StringBuilder::append).append('\n');
        }

        return result.toString();
    }
}
