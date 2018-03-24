package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncodeResistorColors {

    private static final Pattern OHM_PATTERN = Pattern.compile("(\\d{1,3}|\\d\\.\\d)(\\w?) ohms");
    private static final String[] BAND_COLORS = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};

    public static String encodeResistorColors(String ohmsString) {
        Matcher ohmMatcher = OHM_PATTERN.matcher(ohmsString);

        if (ohmMatcher.matches()) {
            StringBuilder result = new StringBuilder();

            double ohm = Double.parseDouble(ohmMatcher.group(1));
            switch (ohmMatcher.group(2)) {
                case "k":
                    ohm *= 1000;
                    break;

                case "M":
                    ohm *= 1000000;
                    break;
            }

            String ohmString = String.valueOf((int) ohm);

            result.append(BAND_COLORS[Character.getNumericValue(ohmString.charAt(0))]).append(" ");
            result.append(BAND_COLORS[Character.getNumericValue(ohmString.charAt(1))]).append(" ");
            result.append(BAND_COLORS[ohmString.length() - 2]).append(" ");

            result.append("gold");

            return result.toString();
        } else {
            return null;
        }
    }
}
