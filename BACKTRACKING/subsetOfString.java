public class subsetOfString {
    public static void printStr(String str, String ans, int i){
        if( i == str.length()){
            System.out.println(ans);
            return;
        }
        printStr(str, ans + str.charAt(i), i+1);
        printStr(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printStr(str, "", 0);
    }
}
