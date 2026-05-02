import java.util.*;

public class diameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info lftInfo= diameter(root.left);
        Info rhtInf = diameter(root.right);

        int diam = Math.max(Math.max(lftInfo.diam,rhtInf.diam), lftInfo.ht+rhtInf.ht+1);
        int ht = Math.max(lftInfo.ht , rhtInf.ht) +1;

        return new Info(diam, ht);

    }

    public static void main(String[] args) {
        Node root = new Node(0);
         root.left = new Node(1);
         root.right = new Node(2);
         root.left.left = new Node(3);
         root.left.right = new Node(4);
         root.right.left = new Node(5);
         root.right.right = new Node(6);

         System.out.println(diameter(root).diam);
         System.out.println(diameter(root).ht);
    }
}
