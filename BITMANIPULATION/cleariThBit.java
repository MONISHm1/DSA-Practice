public class cleariThBit {
    public static int clear(int n, int i){
        int bitMask = 1<<i;
        int bitm = ~bitMask;
        return n&bitm;
    }
    public static void main(String[] args) {
        System.out.println(clear(13, 2));
    }
}
