import java.util.*;
public class reverseStringStack {
    public static String reverse(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!s.isEmpty()) {
            reversed.append(s.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.print(reverse(str));
    }
}
