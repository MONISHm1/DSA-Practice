public class substrin {
    public static String sub(String str, int si,int en ){
        String substr = "";
        for(int i = si; i< en; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
         String str = "helloWorld";
         System.out.println(sub(str, 0, 6));
    }
}
