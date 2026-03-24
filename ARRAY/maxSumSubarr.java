public class maxSumSubarr {
    public static void max(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            for(int j = i; j<arr.length;j++){
                int currSum = 0;
                for(int k = i; k<=j; k++){
                    currSum += arr[k];
                }
                System.out.println("currentsum:" + currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxsum is:"+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        max(arr);
    }
}
