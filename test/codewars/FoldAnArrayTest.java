package codewars;

import java.util.Arrays;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FoldAnArrayTest {

    //@Test
    public void test1() {
        test(
                new int[]{1, 2, 3, 4, 5},
                1,
                new int[]{6, 6, 3}
        );
    }

    //@Test
    public void test2() {
        test(
                new int[]{1, 2, 3, 4, 5},
                2,
                new int[]{6, 6, 3}
        );
    }

    private void test(int[] input, int runs, int[] expected) {
        Assert.assertArrayEquals(expected, FoldAnArray.foldArray(input, runs));
    }

    @Test
    public void basicTests() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{6, 6, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(FoldAnArray.foldArray(input, 1)));

        expected = new int[]{9, 6};
        assertEquals(Arrays.toString(expected), Arrays.toString(FoldAnArray.foldArray(input, 2)));

        expected = new int[]{15};
        assertEquals(Arrays.toString(expected), Arrays.toString(FoldAnArray.foldArray(input, 3)));

        input = new int[]{-9, 9, -8, 8, 66, 23};
        expected = new int[]{14, 75, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(FoldAnArray.foldArray(input, 1)));
    }
}