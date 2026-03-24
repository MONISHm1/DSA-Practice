public class linearSearch {
    public static int linear(int arr[], int key) {
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = linear(arr, key);
        
    }
}
