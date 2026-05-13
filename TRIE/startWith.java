public class startWith {
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

    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i = 0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple","appa","mango","man"};
        String prefix1 = "app";
        String prefix2 = "moon";
        for(int i = 0; i<words.length; i++){
            insertIn(words[i]);
        }
        System.out.println(startWith(prefix2));
    }
}
