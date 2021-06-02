package OtherProjects;

import java.util.Arrays;

public class ArrayTask {
    public int findMaximumElement(int[] arrayOfNumbers) {
        int maximumElement = Integer.MIN_VALUE;
        for (int element : arrayOfNumbers) {
            maximumElement = Math.max(element, maximumElement);
        }
        return maximumElement;
    }

    public int findSmallestElement(int[] arrayOfNumbers) {
        int minimumElement = Integer.MAX_VALUE;
        for (int element : arrayOfNumbers){
            minimumElement = Math.min(element, minimumElement);
        }
        return minimumElement;
    }
}
