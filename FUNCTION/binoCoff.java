public class binoCoff {

     public static int fact (int n){
        int f=1;
        for(int i =1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int bino(int n, int r ){
        int f_n = fact(n);
        int f_r = fact(r);
        int f_nmr = fact(n-r);

        int bino_c = (f_n)/(f_r * f_nmr);
        return bino_c;
    }
    public static void main(String[] args) {
        System.out.println(bino(5, 1));
    }
}
