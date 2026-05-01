import java.util.*;

public class nonRepeatingLettr {
    public static void nonRepeat(String str) {
        int feq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            feq[ch - 'a']++;

            while (!q.isEmpty() && feq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print("-1" + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        nonRepeat(str);
    }
}
