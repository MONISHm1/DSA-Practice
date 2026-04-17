import java.util.ArrayList;

public class pairSumTowPointer {
    public static boolean optimisedPair(ArrayList<Integer> list, int target){
        int left = 0;
        int right = list.size()-1;
        
        while(left < right){
            int sum = list.get(left) + list.get(right);
            if(sum == target){
                return true;
            }
            if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i);
        }
       System.out.println( optimisedPair(list, 10));
    }
}
