package codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TwoToOneTest {

    @Test
    public void test1() {
        test("xyaabbbccccdefww", "xxxxyyyyabklmopq", "abcdefklmopqwxy");
    }

    @Test
    public void test2() {
        test("xyaabbbccccdefww", "xyaabbbccccdefww", "abcdefwxy");
    }

    private void test(String s1, String s2, String expected) {
        assertEquals(expected, TwoToOne.longest(s1, s2));
    }
}
