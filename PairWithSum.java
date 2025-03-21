import java.util.*;
public class PairWithSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> s = new HashSet<>();

        for(int num : arr) {
            if(s.contains(target - num)) {
                return true;
            }
            s.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2};
        int target = 11;
        System.out.println(hasPairWithSum(arr, target));
    }
}
