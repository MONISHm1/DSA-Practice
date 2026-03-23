public class bin_Dec {
    public static void bin(int n){
        int dec = 0;
        int pow = 0;
        while(n>0){
            int last_dig = n % 10;
            dec = dec + (last_dig * (int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.print(dec);
}
    public static void main(String[] args) {
      bin(100);
    }
    
}
