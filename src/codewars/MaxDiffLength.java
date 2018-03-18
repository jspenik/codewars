package codewars;

public class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int max = -1;
        for (String x : a1) {
            for (String y : a2) {
                int current = Math.abs(x.length() - y.length());
                if (current > max) {
                    max = current;
                }
            }
        }

        return max;
    }
}
