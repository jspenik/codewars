package codewars;

import java.util.stream.IntStream;

public class Diamond {

    public static String print(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        int shorterLines = (n - 1) / 2;
        System.out.println("slines: " + shorterLines);

        for (int rowIndex = 1; rowIndex <= n; rowIndex++) {
            int lineWidth = n + 1 / 2 + (rowIndex - 1);
            int nSpaces = Math.abs(shorterLines - rowIndex + 1);
            int nAsterices = lineWidth - nSpaces;

            result.append(
                    IntStream.range(0, nSpaces)
                            .map(i -> ' ').collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            ).append(
                    IntStream.range(0, nAsterices)
                            .map(i -> '*').collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).append('\n')
            );

            System.out.println("lineWidth : " + lineWidth);
            System.out.println("Spaces : " + nSpaces);
            System.out.println("Asterices: " + nAsterices);
        }

        return result.toString();
    }
}
