public class binaryString {
    public static void placeBin(int n , int lastPlace, String str){
        if (n ==0){
            System.out.println(str);
            return;
        }
        placeBin(n-1,  1, str + '1');
        if (lastPlace == 1){
            placeBin(n-1, 0, str + '0');
        }
    }
    public static void main(String[] args) {
        placeBin(3, 0, "");
    }
}
