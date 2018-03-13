package codewars;

import codewars.SecondMinTree.Node;
import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.Assert;
import org.junit.Test;

public class SecondMinTreeTest {

    @Test
    public void testMin() {
        Node root = new Node();
        root.value = 10;

        root.left = new Node();
        root.left.value = 12;

        root.right = new Node();
        root.right.value = 1;

        Assert.assertEquals(1, SecondMinTree.min(root));
    }

    @Test
    public void testMin2() {
        Node root = new Node();
        root.value = 10;

        root.left = new Node();
        root.left.value = 12;

        root.right = new Node();
        root.right.value = 1;

        root.right.left = new Node();
        root.right.left.value = 8;

        root.right.right = new Node();
        root.right.right.value = 7;

        TreeSet<Integer> mins = new TreeSet<>();

        SecondMinTree.secondMin(root, mins);

        Assert.assertEquals(7l, new ArrayList<>(mins).get(1).intValue());
    }
}
