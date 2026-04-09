public class tillingProblem {
    public static int ways(int m, int n){
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }
        return ways(m, n-1) + ways(m, n-m);
    }
    public static void main(String[] args) {
        System.out.print(ways(2, 5));
    }
}
