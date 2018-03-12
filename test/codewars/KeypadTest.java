package codewars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KeypadTest {

    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
        assertEquals(51, Keypad.presses("iLk@a$YIuLhbOenCLnOHPVMQ"));
        assertEquals(49, Keypad.presses("#d$hNOCfP,lj*tsvmEKKlqSs"));
        assertEquals(52, Keypad.presses("pijkSakAcgrSLt#DiiyA*,rTbG$$aP"));
    }
}
