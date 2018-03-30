package codewars;

import java.util.stream.Stream;

class SumFractions {

    public static String sumFracts(int[][] l) {
        return Stream.of(l)
                .map(i -> new Fraction(i[0], i[1]))
                .reduce(Fraction::add)
                .map(Fraction::toString)
                .orElse(null);
    }

    static class Fraction {

        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
            reduce();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        private void reduce() {
            int gcd = calculateGCD(numerator, denominator);

            this.numerator /= gcd;
            this.denominator /= gcd;
        }

        public static Fraction add(Fraction a, Fraction b) {
            return new Fraction(
                    a.numerator * b.denominator + a.denominator * b.numerator,
                    a.denominator * b.denominator
            );
        }

        public static final int calculateGCD(int numerator, int denominator) {
            if (numerator % denominator == 0) {
                return denominator;
            }

            return calculateGCD(denominator, numerator % denominator);
        }

        @Override
        public String toString() {
            return denominator == 1 ? numerator + "" : String.format("[%d, %d]", numerator, denominator);
        }
    }
}
