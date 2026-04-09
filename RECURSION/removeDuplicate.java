public class removeDuplicate {
    public static void remove(String str, StringBuilder newStr, boolean map[], int i){
        if(i == str.length()){
            System.out.print(newStr);
            return ;
        }
        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){
            remove(str, newStr, map, i+1);
        }else{
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            remove(str, newStr, map, i+1);
        }
    }
    public static void main(String[] args) {
        String str = "appnacoleze";
        StringBuilder newStr = new StringBuilder("");
        boolean[] map = new boolean [26];
        remove(str, newStr, map, 0);
    }
}
