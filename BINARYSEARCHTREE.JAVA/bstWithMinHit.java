public class bstWithMinHit {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    } 

    public static Node minHt(int arr[], int srt, int end){
        if(srt>end) return null;
        int mid = srt + (end - srt)/2;
        Node root = new Node(arr[mid]);
        root.left = minHt(arr, srt, mid-1);
        root.right = minHt(arr, mid+1, end);

        return root;
    }

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        
    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        Node root = minHt(arr, 0, arr.length-1);
        inOrder(root); 
    }
}
