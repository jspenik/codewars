package codewars;

import java.util.TreeSet;

public class SecondMinTree {

    public static int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int current = root.value;
        int left = min(root.left);
        int right = min(root.right);

        if (current < left && current < right) {
            return current;
        }

        if (left < right) {
            return left;
        }

        return right;
    }

    public static void secondMin(Node root, TreeSet<Integer> mins) {
        if (root == null) {
            return;
        }

        mins.add(root.value);
        secondMin(root.left, mins);
        secondMin(root.right, mins);
    }

    public static class Node {

        Node left;
        Node right;
        int value;
    }

}
