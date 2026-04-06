public class fastExponentional {
    // public static int fast(int a, int n){
    //     int ans = 1;
    //     while (n > 0) {
    //         if( (n & 1) != 0){
    //             ans = ans * a;
    //         }
    //         a = a*a;
    //         n = n>>1;
    //     }
    //     return ans;
    // }


    public static int fast(int a, int n){
        if(n == 0) return 1;
        int half = fast(a, n/2);
        int halfSq = half *half;
        if((n % 2) != 0){
            return a * halfSq;
        }
        return halfSq;
    }
    public static void main(String[] args) {
        System.out.print(fast(5, 4));
    }
}
