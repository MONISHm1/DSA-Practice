public class toggleBit {
    public static int toggle(int n, int i){
        int bitMask = 1<<i;
        return n ^ bitMask;
    }
    public static void main(String[] args) {
        System.out.println(toggle(5, 1));
    }
}
