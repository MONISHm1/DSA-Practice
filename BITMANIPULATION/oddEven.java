public class oddEven {
    public static void oddEven(int n) {
        int bitMAsk = 1;
        if ((n & bitMAsk) == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("it is odd");
        }
    }

    public static void main(String[] args) {
        int n = 1;
        oddEven(n);
    }
}
