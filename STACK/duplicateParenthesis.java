import java.util.Stack;

public class duplicateParenthesis {
    public static boolean isDuplictae(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                int count = 0;

                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if(count < 1){
                    return true; 
                }

                if(!s.isEmpty()) {
                    s.pop(); 
                }
            }
            else{
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.print(isDuplictae(str));
    }
}