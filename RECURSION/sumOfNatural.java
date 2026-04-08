public class sumOfNatural {
    public static int sumNat(int n){
        if (n==0) return 0;
        return n + sumNat(n - 1);
    }
   public static void main(String[] args) {
    System.out.print(sumNat(5));
   } 
}
