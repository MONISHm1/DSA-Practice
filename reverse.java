public class reverse{
    public static void main(String[] args) {
        int n = 10899;
        int reverse = 0;
        while (n != 0) {
        int lastDgt  = n % 10;
        // System.out.print(lastDgt);
        reverse = (reverse*10) + lastDgt;
         n = n/10;

        }
        System.out.println(reverse); 
    }
}