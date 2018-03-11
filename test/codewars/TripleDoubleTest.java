package codewars;

import static codewars.TripleDouble.TripleDouble;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TripleDoubleTest {

    @Test
    public void test1() {
        assertEquals(1, TripleDouble(451999277L, 41177722899L));
    }

    @Test
    public void test2() {
        assertEquals(0, TripleDouble(1222345L, 12345L));
    }

    @Test
    public void test3() {
        assertEquals(0, TripleDouble(12345L, 12345L));
    }

    @Test
    public void test4() {
        assertEquals(1, TripleDouble(666789L, 12345667L));
    }

    @Test
    public void test5() {
        assertEquals(0, TripleDouble(451999277, 411777228L));
    }
}
