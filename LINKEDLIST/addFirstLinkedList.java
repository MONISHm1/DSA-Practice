import java.util.*;
import java.util.LinkedList;

public class addFirstLinkedList {
   public static class Node{
    int data; 
    Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
   } 

   public static Node head;
   public static Node tail;

   public void  addFirst(int data){
    Node newnode = new Node(data);
    if(head == null){
        head=tail=newnode;
        return;
    }
    newnode.next = head;
    head = newnode;
   }

   //method for print
   public void printList(){
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("null");
   }
   public static void main(String[] args) {
    addFirstLinkedList ll = new addFirstLinkedList();
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);

    ll.printList();
   }
}
