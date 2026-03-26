import java.util.*;
public class bubbleSort {
    public static void bubble(int arr[]){
        int n = arr.length;
        for(int turn =0; turn < n-1;turn++){
            for(int j = 0; j< n-turn-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        bubble(arr);
        print(arr);
    }
}
