import java.util.*;

public class inbultsort {
    public static void main(String[] args) {
        Integer arr[] = {2,4,1,3,5,9,6,8,7};
        // Arrays.sort(arr,0,6);
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
