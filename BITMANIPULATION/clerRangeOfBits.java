public class clerRangeOfBits {
    public static int clear(int n, int i, int j){
        int left = (~0)<< (j+1);
        int right = (1<<i)-1;
        int bitMAsk = left | right;
        return n & bitMAsk;
    }
    public static void main(String[] args) {
        System.out.println(clear(10, 2, 4));
    }
}
