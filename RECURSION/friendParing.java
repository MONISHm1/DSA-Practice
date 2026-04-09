public class friendParing {
    public static int countWays(int n){
        if ( n ==0) return 1;
        if( n == 1 || n ==2) return n;
        int single = countWays(n-1);
        int pair = (n-1) * countWays(n-2);
        return single + pair;
    }
    public static void main(String[] args) {
        System.out.println(countWays(3));
    }
}
