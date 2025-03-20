import java.util.Stack;

public class SortStackRecursively {
    public static void sortStack(Stack<Integer> stack) {
        if(!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int data) {
        if(stack.isEmpty() || stack.peek() <= data) {
            stack.push(data);
        }
        else {
            int temp = stack.pop();
            insertSorted(stack, data);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(3);
        stack.push(5);
        stack.push(7);

        sortStack(stack);
        System.out.println(stack);
    }
}
