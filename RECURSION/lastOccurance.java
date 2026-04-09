public class lastOccurance {
    public static int lastOccr(int arr[], int i, int key){
        if (i == arr.length) return -1;
       int resIndx = lastOccr(arr, i+1, key);
       if(resIndx != -1){
        return resIndx;
       }
        if(arr[i] == key) return i;
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,1,2,5,3};
        System.out.println(lastOccr(arr, 0, 5));

    }
}
