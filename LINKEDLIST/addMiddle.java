import java.util.*;
public class addMiddle {
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void middle(int idx, int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        if(idx == 0){
            newNode.next = head;
            head = newNode; 
        }
        int i = 0;
        while (i<idx-1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if(temp == null ){
            System.out.println("out of bound");

        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void printLast(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        addMiddle ll = new addMiddle();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLast();
        System.out.println(ll.size);
        ll.middle(2, 10);
        ll.printLast();
        System.out.print(ll.size);
    }
}
