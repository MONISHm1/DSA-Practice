import java.util.*;
public class rootToLeafPath {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i =0;i <path.size();i++){
            System.out.print(path.get(i) + " ");
        }
        System.out.println("Null");
    }

    public static void printLeaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        printLeaf(root.left, path);
        printLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValid(Node root, Node min, Node max){
        if(root == null) return true;
        if((min != null && root.data <= min.data) || (max != null && root.data >= max.data)){
            return false;
        }
         return isValid(root.left, min, root)
             && isValid(root.right, root, max);
    }


    // mirror
    public static Node createMirror(Node root){
        if (root == null){
            return null;
        }
        Node mirroeleft = createMirror(root.left);
        Node mirrorRight = createMirror(root.right);

        root.left = mirrorRight;
        root.right = mirroeleft;
        return root;
    }

    public static void preOreder(Node root){
        if(root == null) return;

        System.out.print(root.data +  " ");
        preOreder(root.left);
        preOreder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // System.out.println("root2path");
        // printLeaf(root, new ArrayList<>());

        // System.out.print(isValid(root, null, null));

        System.out.println(createMirror(root));
        preOreder(root);
    }
}
