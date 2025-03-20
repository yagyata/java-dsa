import java.util.Stack;

public class StockSpanProblem {
    public static int[] calculateSpan(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[prices.length];

        for(int i=0; i<prices.length; i++) {
            while(!stack.empty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i+1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {50, 60, 80, 70, 80, 40};
        int[] spans = calculateSpan(prices);
        for(int s : spans) {
            System.out.print(s + " ");
        }
    }
}
