package codewars;

import java.text.MessageFormat;
import java.util.Locale;

public class DecodeResistorColors {

    private static final MessageFormat OUTPUT_FORMAT = new MessageFormat(
            "{0,number,#.##}{1} ohms, {2,number,#}%",
            Locale.ENGLISH
    );

    public static String decodeResistorColors(String bands) {
        String[] bandsArray = bands.split(" ");

        int ohm = ColorCode.valueOf(bandsArray[0]).value * 10 + ColorCode.valueOf(bandsArray[1]).value;
        ohm *= (Math.pow(10, ColorCode.valueOf(bandsArray[2]).value));

        int tolerance = bandsArray.length == 4
                ? ToleranceCode.valueOf(bandsArray[3]).value
                : ToleranceCode.DEFAULT.value;

        if (ohm >= 1000000) {
            return OUTPUT_FORMAT.format(new Object[]{
                ohm * 1.0 / 1000000, "M", tolerance
            });
        } else if (ohm >= 1000) {
            return OUTPUT_FORMAT.format(new Object[]{
                ohm * 1.0 / 1000, "k", tolerance
            });
        } else {
            return OUTPUT_FORMAT.format(new Object[]{
                ohm * 1.0 / 1, "", tolerance
            });
        }
    }

    static enum ColorCode {
        black(0),
        brown(1),
        red(2),
        orange(3),
        yellow(4),
        green(5),
        blue(6),
        violet(7),
        gray(8),
        white(9);

        private final int value;

        private ColorCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    static enum ToleranceCode {
        DEFAULT(20),
        gold(5),
        silver(10);

        private final int value;

        private ToleranceCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }
}
