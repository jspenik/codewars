package codewars;

public class Persist {

    public static int persistence(long n) {
        long m = 1;

        if (n / 10 == 0) {
            return 0;
        }

        for (long r = n; r != 0; r /= 10) {
            m *= r % 10;
        }

        return persistence(m) + 1;
    }
}
