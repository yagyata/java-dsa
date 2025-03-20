import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] num, int k) {
        if(num.length == 0) {
            return new int[0];
        }

        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[num.length - k +1];

        for(int i=0; i<num.length; i++) {
            if(!deque.isEmpty() && deque.peek()< i - k + 1){
                deque.poll();
            }
            while(!deque.isEmpty() && num[deque.peekLast()] < num[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if(i >= k - 1){
                result[i-k+1] = num[deque.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {4, 2, -1, 3, 5, 7, 3};
        int k = 4;
        int[] result = maxSlidingWindow(num, k);
        for(int n: result){
            System.out.print(n + " ");
        }
    }
}
