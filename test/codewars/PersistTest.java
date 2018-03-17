package codewars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersistTest {

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        System.out.println("---");
        assertEquals(0, Persist.persistence(4));
        System.out.println("---");
        assertEquals(2, Persist.persistence(25));
        System.out.println("---");
        assertEquals(4, Persist.persistence(999));
        System.out.println("---");
    }
}
