public class binarySearch {
    public static int bin(int arr[], int key){
        int start = 0; 
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(key == arr[mid]) {
                return mid;
            } 
            if(arr[mid] < key){
                start = mid +1;
            }
            if(arr[mid] > key){
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,8,9};
        int key = 8;
        System.out.println(bin(arr, key));
    }
}
