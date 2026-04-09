public class powerNoPtimised {
    public static int optimised(int x, int n){
        if(n==0) return 1;
        int halfPower = optimised(x, n/2);
        int halfPowerSqr = halfPower * halfPower;
        if( n%2 !=0) return x * halfPowerSqr ;
        return halfPowerSqr;

    }
    public static void main(String[] args) {
        System.out.println(optimised(3, 3));
    }
}
