import java.util.*;
public class wordBreak {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i =0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void inserIn(String word){
        Node curr = root;
        for(int level = 0; level<word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean searchIn(String key){
        Node curr = root;
        for(int level =0; level<key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean WordBrak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i =1; i<=key.length(); i++){
            if(searchIn(key.substring(0,i)) && WordBrak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String word[] = {"i","like","sam","samsung","mobile","ice"};
        for(int i = 0; i<word.length; i++){
            inserIn(word[i]);
        }
        String key = "ilikesam";
        System.out.println(WordBrak(key));
    }
}
