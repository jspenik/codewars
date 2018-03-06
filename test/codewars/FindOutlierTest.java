package codewars;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FindOutlierTest {

    @Test
    public void runTest1() {
        int[] exampleTest = {2, 6, 8, -10, 3};

        Assert.assertEquals(3, FindOutlier.find(exampleTest));
    }

    @Test
    public void runTest2() {
        int[] exampleTest = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};

        Assert.assertEquals(206847684, FindOutlier.find(exampleTest));
    }

    @Test
    public void runTest3() {
        int[] exampleTest = {Integer.MAX_VALUE, 0, 1};

        Assert.assertEquals(0, FindOutlier.find(exampleTest));
    }

    @Test
    public void runTest4() {
        int[] exampleTest = {2, 4, 0, 100, 4, 11, 2602, 36};

        Assert.assertEquals(11, FindOutlier.find(exampleTest));
    }

    @Test
    public void runTest5() {
        int[] exampleTest = {160, 3, 1719, 19, 11, 13, -21};

        Assert.assertEquals(160, FindOutlier.find(exampleTest));
    }

    @Test
    public void runTest6() {
        int[] exampleTest = {17, 0, 6, 8};

        Assert.assertEquals(17, FindOutlier.find(exampleTest));
    }
}
