import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int longestConsecutive = 0;
        for(int num:set) {
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentConsecutive = 1;

                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    currentConsecutive++;
                }
                longestConsecutive = Math.max(longestConsecutive, currentConsecutive);
            }
        }
        return longestConsecutive;
    }

    public static void main(String[] args) {
        int[] arr = {40, 60, 61, 58, 62};
        System.out.println(longestConsecutive(arr));
    }
}

//Output : 3
//(60, 61, 62)
