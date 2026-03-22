public class isPrime {

    public static boolean isprm(int  n){
        if (n<=1){
            return false;
        }
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isprm(3));
    }
}
