import java.util.*;

public class StackArraylist {
    static class Stack {
        ArrayList<Integer> ll = new ArrayList<>();

        // isEmpty
        public boolean isEmpty() {
            return ll.size() == 0;
        }

        // push
        public void push(int data) {
            ll.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return ll.remove(ll.size() - 1);
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return ll.get(ll.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}