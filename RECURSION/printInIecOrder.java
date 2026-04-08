public class printInIecOrder{
    public static void order(int n){
        if (n ==0) return;
        order(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        order(5);
    }
}