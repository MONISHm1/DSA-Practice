import java.util.*;
public class subTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        if(root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right)) return true;
        return false;
    }

    public static boolean isSubtree(Node T, Node S){
        if( S == null){
            return true;
        }
        if(T == null){
            return false;
        }

        if(T.data == S.data){
            if(isIdentical(T,S)){
                return true;
            }
        }

        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }

    public static void main(String[] args) {
        Node T =new Node(0);
        T.left = new Node(2);
        T.right = new Node(3);
        T.left.left = new Node(4);
        T.left.right = new Node(5);

        Node S = new Node(2);
        S.left = new Node(4);
        S.right = new Node(5);
        

        if(isSubtree(T, S)){
            System.out.println( " S is subtre of t");
        }
        else{
            System.out.println("not");
        }
    }
}
