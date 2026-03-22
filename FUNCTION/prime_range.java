import java.util.Scanner;

public class prime_range {
    public static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    //for range value
    public static void range(int n) {
        int count = 0;
        for(int i = 2 ; i <= n; i++){
            if(isprime(i)){
                System.out.println(i  + " ");
                count++;
            }
        }
        System.out.print("count = "+ count);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        range(5);

    }    
}
