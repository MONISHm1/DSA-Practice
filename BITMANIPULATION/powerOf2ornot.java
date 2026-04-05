public class powerOf2ornot {
    public static boolean powerof(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerof(5));
    }
}
