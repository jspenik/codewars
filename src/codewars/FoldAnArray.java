package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FoldAnArray {

    public static int[] foldArray(int[] array, int runs) {
        if (array.length == 1) {
            return array;
        }

        boolean oddLength = array.length % 2 != 0;
        int foldPoint = array.length / 2 + (oddLength ? 1 : 0);

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> foldedList = list.subList(0, foldPoint);
        List<Integer> folderList = list.subList(foldPoint, list.size());
        Collections.reverse(folderList);

        for (int i = 0; i < folderList.size(); i++) {
            foldedList.set(i, foldedList.get(i) + folderList.get(i));
        }

        if (runs > 1) {
            return foldArray(foldedList.stream().mapToInt(i -> i).toArray(), runs - 1);
        } else {
            return foldedList.stream().mapToInt(i -> i).toArray();
        }
    }
}
