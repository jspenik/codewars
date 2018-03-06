package codewars;

public class FindOutlier {

    static int find(int[] integers) {
        int lastOdd = 0, oddCount = 0;
        int lastEven = 0, evenCount = 0;

        for (int i = 0; i < integers.length; i++) {
            int current = integers[i];
            if (current != 0 && current % 2 != 0) { // The current number is odd
                lastOdd = current;
                oddCount++;
            } else {
                lastEven = current;
                evenCount++;
            }
        }

        return oddCount < evenCount ? lastOdd : lastEven;
    }

    static int find2(int[] integers) {
        boolean allOdd = (integers[0] + integers[1] + integers[3]) % 2 != 0;

        for (int i = 0; i < integers.length; i++) {
            int current = integers[i];
            boolean currentOdd = current != 0 && current % 2 != 0;

            if (allOdd ^ currentOdd) {
                return current;
            }
        }

        throw new IllegalArgumentException("The array must contains an outliner!");
    }
}
