import java.util.*;

public class subArrSumK {
public static int sumK(int arr[], int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0, ans = 0;
    map.put(0, 1);

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

       if(map.containsKey(sum - k)){
         ans += map.get(sum-k);
       }

        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return ans;
}
        public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        System.out.println(sumK(arr, k)); 
    }
}