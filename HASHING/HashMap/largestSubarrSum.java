import java.util.*;
public class largestSubarrSum {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0; 
        int maxLen = 0;
       
           for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            if(sum == 0){
                maxLen = i+1;
            }
            if(map.containsKey(sum)){
                int prevIdx = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIdx);
            }
            else{
                map.put(sum, i);
            }
           }
        System.out.println("largest sum with 0 is:" + maxLen);
    }
}
