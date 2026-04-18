import java.util.*;

public class addLast {
    public static Node head;
    public static Node tail;
    public class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void lastAdd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void prinntLast(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addLast ll = new addLast();
        ll.lastAdd(0);
        ll.lastAdd(1);
        ll.lastAdd(2);
        ll.lastAdd(3);

        ll.prinntLast();
    }
}
