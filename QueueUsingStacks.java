import java.util.Stack;
public class QueueUsingStacks {
    Stack<Integer> enqueueStack = new Stack<>();
    Stack<Integer> dequeueStack = new Stack<>();

    public void enqueue(int data) {
        enqueueStack.push(data);
    }

    public int dequeue() {
        if(dequeueStack.isEmpty()) {
            if(enqueueStack.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            while(!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }

    public int peek() {
        if(dequeueStack.isEmpty()) {
            if (enqueueStack.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while(!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return  dequeueStack.peek();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }

}
