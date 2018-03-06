package codewars;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArgeTest {

    @Test
    public void test1() {
        test(1500, 5, 100, 5000, 15);
    }

    private void test(int p0, double percent, int aug, int p, int expected) {
        assertEquals(expected, Arge.nbYear(p0, percent, aug, p));
    }
}
