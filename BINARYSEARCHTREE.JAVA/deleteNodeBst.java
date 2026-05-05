public class deleteNodeBst {
    static class Node {
        int data; 
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // INSERT METHOD (needed to build tree)
    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // DELETE METHOD
    public static Node delete(Node root, int val){
        if(root == null) return null;

        if(val < root.data) {
            root.left = delete(root.left, val);
        } else if(val > root.data){
            root.right = delete(root.right, val);
        } else {
            // Case 1: Leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // Case 2: One child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            // Case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    // Find minimum (inorder successor)
    public static Node findMin(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Inorder traversal (for printing)
    public static void printInOrder(Node root){
        if(root == null) return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        // Build BST
        for(int val : values){
            root = insert(root, val);
        }

        System.out.print("Before deletion: ");
        printInOrder(root);
        System.out.println();

        // Delete node
        root = delete(root, 1);

        System.out.print("After deletion: ");
        printInOrder(root);
        System.out.println();
    }
}