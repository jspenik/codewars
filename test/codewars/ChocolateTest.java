package codewars;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ChocolateTest {

    @Test
    public void test1() {
        test(1, 1, 0);
    }

    @Test
    public void test2() {
        test(1, 2, 1);
    }

    @Test
    public void test3() {
        test(2, 1, 1);
    }

    @Test
    public void test4() {
        test(3, 5, 14);
    }

    @Test
    public void test5() {
        test(5, 3, 14);
    }

    private void test(int n, int m, int expected) {
        Assert.assertEquals(expected, Chocolate.breakChocolate(n, m));
    }

}
