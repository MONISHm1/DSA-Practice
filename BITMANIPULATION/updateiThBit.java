public class updateiThBit {
    public static int update(int n, int i, int newNum){
        n = n & ~(1<<i);
        return  n | (newNum << i);
    }
    public static void main(String[] args) {
        System.out.print(update(10, 2, 1));
    }
}
