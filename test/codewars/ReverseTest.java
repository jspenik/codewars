package codewars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseTest {

    @Test
    public void testSomething() {
        Reverse rVer = new Reverse();
        String r = rVer.reverse("hello world");
        System.out.println(r);

        assertEquals("dlrow olleh", r);

        rVer = new Reverse();
        r = rVer.reverse("Spenik János");
        System.out.println(r);
        assertEquals("sonáJ kinepS", r);
    }
}
