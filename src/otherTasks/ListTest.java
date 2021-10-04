package otherTasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black","yellow","blue","violet", "silver"};
        int[] array = {2,3,4,5};
//        System.out.println(List.of(2,3,4,5).getClass());
//        System.out.println(Arrays.asList(array, 3, 7, 8).subList(0,1).stream());
        for (String s : colors) {
            System.out.println(s);
        }
    }
}
