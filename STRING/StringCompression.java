public class StringCompression {

    public static String Compression(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char currentChar = str.charAt(i);

            while (i < str.length() && str.charAt(i) == currentChar) {
                count++;
                i++;
            }

            i--; // 🔥 Important fix

            sb.append(currentChar);
            sb.append(count);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabbbcccdddeef";
        System.out.print(Compression(str));
    }
}