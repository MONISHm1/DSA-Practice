public class diagnolMatrix {
    // public static int diagnol(int arr[][]){
    //     int sum =0;
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=0; j<arr[0].length; j++){
    //             if(i==j){
    //                 sum+= arr[i][j];
    //             }
    //             else{
    //                 if((i+j) == arr.length-1){
    //                     sum += arr[i][j];
    //                 }
    //             }
    //         }
    //     }
    //     return sum;
    // }

    //optimised code
    public static int diagnolSum(int arr[][]){
        int sum =0;
        int n = arr.length;
        for(int i= 0; i<n; i++){
            //primary sum
            sum +=arr[i][i];

            //secondary sum
            if(i !=n-1-i){
                sum += arr[i][n-1-i];
            }
        }
        return sum;
    }
   public static void main(String[] args) {
    int arr[][] = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}};
        System.out.println(diagnolSum(arr));
        
   }
}
