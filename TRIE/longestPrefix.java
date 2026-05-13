import java.util.*;
public class longestPrefix {
        static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i =0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insertIn(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean searchIn(String key){
        Node curr = root;
        for(int level = 0; level<key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
         return curr.eow;
    }

    public static String finalAns = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > finalAns.length()) {
                    finalAns = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); 
            }
        }
    }
    public static void main(String args[]) {
        // Example for Word Break
        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        for (int i = 0; i < words.length; i++) {
            insertIn(words[i]);
        }
       


        // Example for Longest Word with all Prefixes
        String words2[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        root = new Node(); // Resetting root for fresh start
        for (String w : words2) insertIn(w);
        longestWord(root, new StringBuilder(""));
        System.out.println("Longest word with all prefixes: " + finalAns);
    }
}
