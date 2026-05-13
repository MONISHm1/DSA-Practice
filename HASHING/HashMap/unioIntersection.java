import java.util.*;
public class unioIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {7,3,9,6,2,4};
        HashSet <Integer> hs = new HashSet<>();
        for(int i = 0; i< arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int j =0; j<arr2.length; j++){
            hs.add(arr2[j]);
        }
        System.out.println(hs);

        hs.clear();

        for(int i = 0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        int count = 0;
        for(int j = 0; j<arr2.length;j++){
            if(hs.contains(arr2[j])){
                count++;
                hs.remove(arr2[j]);
                
            }
        }
        System.out.println(count);
      
    }
}
