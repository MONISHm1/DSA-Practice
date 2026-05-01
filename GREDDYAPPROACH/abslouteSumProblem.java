import java.util.*;
public class abslouteSumProblem {
    public static void main(String[] args) {
        int arr[] = {4,1,8,7};
        int arr1[] = {2,3,6,5};

        Arrays.sort(arr);
        Arrays.sort(arr1);
        int minDiff = 0;
        for(int i = 0; i< arr1.length;i++){
            minDiff += Math.abs(arr[i] - arr1[i]);
        } 
        System.out.println(minDiff);
    }
}
