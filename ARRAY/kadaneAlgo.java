// public class kadaneAlgo {
//     public static void kadane(int arr[]){
//         int maxSum = Integer.MIN_VALUE;
//         int curSum = 0;
//         for (int i = 0; i<arr.length; i++){
//             curSum = curSum + arr[i];
//             if(curSum < 0){
//                 curSum = 0;
//             }
//             maxSum = Math.max(curSum, maxSum);
//         }
//         System.out.println(maxSum);
//     }
//     public static void main(String[] args) {
//         int arr[] = {-2,-3,4,5,-6,1};
//         kadane(arr);
//     }

// }

public class kadaneAlgo {
    public static void kadane(int arr[]) {
        int maxSum = arr[0]; // ✅ important
        int curSum = arr[0]; // ✅ start from first element

        for (int i = 1; i < arr.length; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, 5, -6, 1 };
        kadane(arr);
    }
}