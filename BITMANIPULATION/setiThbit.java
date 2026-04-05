public class setiThbit {
    public static int setIth(int n , int i){
        int bitMasx = 1<<i;
       return n | bitMasx;
    }
    public static void main(String[] args) {
        System.out.println(setIth(10, 0));
    }
}
