import java.util.*;

public class TwoSumProblem {
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            numMap.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 9};
        int target = 14;
        int[] result = findTwoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}