package codewars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DiamondTest {

    @Test
    public void test3() {
        test(
                3,
                new StringBuilder().
                        append(" *\n").
                        append("***\n").
                        append(" *\n")
        );
    }

    @Test
    public void test5() {
        test(
                5,
                new StringBuilder().
                        append("  *\n").
                        append(" ***\n").
                        append("*****\n").
                        append(" ***\n").
                        append("  *\n")
        );
    }

    @Test
    public void test7() {
        test(
                7,
                new StringBuilder().
                        append("   *\n").
                        append("  ***\n").
                        append(" *****\n").
                        append("*******\n").
                        append(" *****\n").
                        append("  ***\n").
                        append("   *\n")
        );
    }

    private void test(int n, StringBuilder expected) {
        String result = Diamond.print(n);
        System.out.println(result);
        System.out.println("--");

        assertEquals(expected.toString(), result);
    }
}
