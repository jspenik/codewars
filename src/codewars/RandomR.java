package codewars;

import java.util.Random;

public class RandomR {

    private final Random random = new Random();

    public int random(int min, int max) {
        if (min == Integer.MIN_VALUE || max == Integer.MAX_VALUE) {
            return (int) ((random.nextLong() & Long.MAX_VALUE) % (1L + max - min)) + min;
        } else {
            return random.nextInt(max - min + 1) + min;
        }
    }

    public static void main(String[] args) {
        System.out.println(-102121l & Long.MAX_VALUE%12l);

        RandomR r = new RandomR();

        int n;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        do {
            n = r.random(min, max);
            System.out.println("n: " + n);
        } while (n < 0);

    }

}
