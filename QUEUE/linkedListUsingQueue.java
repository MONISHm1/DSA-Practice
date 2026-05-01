public class linkedListUsingQueue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
         Node head = null;
         Node tail = null;

        // isempty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("empty to remove");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("peek is empty");
                return -1;
            } else {
                return head.data;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
