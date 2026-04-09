public class powerN {
    public static int powerrr(int x, int n){
        if(n==0) return 1;
        return x * powerrr(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(powerrr(2, 0));
    }
}
