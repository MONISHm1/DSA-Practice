public class printInDecOrder {
    public static void order(int n){
        if (n == 0){
            return;
        }
        System.out.print(n);
        order(n-1);
    }
    public static void main(String[] args) {
        order(5);
    }
}
