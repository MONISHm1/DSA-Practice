public class printinRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // INSERT
    public static Node insertNode(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    // PRINT IN RANGE
    public static void printInRange(Node root, int k1, int k2){
        if(root == null) return;

        if(k1 < root.data){
            printInRange(root.left, k1, k2);
        }

        if(k1 <= root.data && root.data <= k2){
            System.out.print(root.data + " ");
        }

        if(root.data < k2){
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {10,5,15,2,7,20};

        Node root = null;

        // Build BST
        for(int val : values){
            root = insertNode(root, val);
        }

        int k1 = 5, k2 = 15;

        System.out.print("[" + k1 + "," + k2 + "] -> ");
        printInRange(root, k1, k2);
        System.out.println();
    }
}