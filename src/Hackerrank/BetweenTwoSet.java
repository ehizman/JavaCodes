package Hackerrank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BetweenTwoSet {

    public static int getTotalX(List<Integer> a, List<Integer>b){
        if (a.isEmpty()){
            return 0;
        }
        if (b.isEmpty()){
            return 0;
        }
        int maxInA = a.stream().max(Comparator.naturalOrder()).get();
        int maxInB = b.stream().max(Comparator.naturalOrder()).get();
        int minInA = a.stream().min(Comparator.naturalOrder()).get();
        int minInB = b.stream().min(Comparator.naturalOrder()).get();
        int max = Math.max(maxInA, maxInB);
        int min = Math.min(minInA, minInB);
        List<Integer> result = new ArrayList<>();
        for (int i = min; i < max; i++) {
            if (isMultiple(i, a)){
                if (isFactor(i, b)){
                    result.add(i);
                }
            }
            if (isMultiple(i, a)){
                if (isFactor(i, b)){
                    if (!result.contains(i))
                        result.add(i);
                }
            }
        }
        return result.size();
    }

    private static boolean isFactor(Integer integer, List<Integer> b) {
        for (Integer value: b) {
            if (value % integer != 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isMultiple(Integer integer, List<Integer> a) {
        for (Integer value: a) {
            if (integer % value != 0){
                return false;
            }
        }
        return true;
    }
}
