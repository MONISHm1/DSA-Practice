import java.util.*;
public class bst2Balancedbst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(ArrayList<Integer> inOrder,Node root){
        if(root == null) return;
        getInorder(inOrder,root.left);
        inOrder.add(root.data);
        getInorder(inOrder,root.right);
    }

    public static Node createBst(ArrayList<Integer> inOrder, int strt, int end){
        if(strt > end) return null;

        int mid = strt + (end - strt)/2;
        Node root = new Node(inOrder.get(mid));

        root.left = createBst(inOrder, strt, mid-1);
        root.right = createBst(inOrder, mid + 1, end);
        return root;
    }

    public static Node buildBst(Node root){
        ArrayList<Integer> Inorder = new ArrayList<>();
        getInorder(Inorder, root);
        root = createBst(Inorder, 0, Inorder.size()-1);
        return root;
    }

    public static void main(String[] args) {
            Node root = new Node( 8);
            root.left = new Node( 6);
            root.left.left = new Node( 5);
            root.left.left.left = new Node( 3);

            root.right = new Node( 10);
            root.right.right = new Node( 11);
            root.right.right.right = new Node( 12);
            root = buildBst(root);
            preOrder(root);
    }
}
