// public class gridWays {
//     public static int totalWays(int i, int j , int  m, int n){
//         if(i == m-1 && j == n-1){
//             return 1;
//         }
        
//         if( i == m || j == n){
//             return 0;
//         }


//         int w1 = totalWays(i+1, j, m, n);
//         int w2 = totalWays(i, j+1, m, n);
//         return w1 + w2;

//     }
//     public static void main(String[] args) {
//         int m = 3;
//         int n = 3;
//         System.out.println(totalWays(0, 0, m, n));
//     }
// }


//optimised grid 
public class gridWays {

    public static long totalWays(int m, int n) {

      int N  = m+n-2;
      int r = Math.min(n-1, m-1);
      long res =1;
      for(int i =1; i<=r; i++){
        res = res * (N-r+i)/i;
      }
      return res;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(totalWays(m, n));
    }
}