public class removeFirstEle {
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static class Node {
        int data; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void printList(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void main (String [] args){
        removeFirstEle ll = new removeFirstEle();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.printList();   // 1->2->3->4->null

        ll.removeFirst();

        ll.printList();   // 2->3->4->null
    }
}