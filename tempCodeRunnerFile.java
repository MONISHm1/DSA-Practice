public class printPatten {

    public static int linear(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while (start >= end ) {
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(arr[mid] < key){
                start = mid +1;
            }
            if (arr[mid] > key) {
                end = mid -1;
            }
        }
        return -1;
    }
   

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println(linear(arr,key) );
    }
}