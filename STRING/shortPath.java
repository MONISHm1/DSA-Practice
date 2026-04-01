public class shortPath {
    public static float shortP(String str){
        int n = str.length();
        int X=0; int Y = 0;
        for(int i=0; i<n; i++){
            char dir = str.charAt(i);
            if(dir == 'E'){
                X++;
            }
            else if (dir == 'W') {
                X--;
            }
            else if (dir == 'N') {
                Y++;
            }
            else{
                Y--;
            }
        }
        int x1 = X * X;
        int y1 = Y * Y;
        return (float)(Math.sqrt(x1+y1)); 
    }
    public static void main(String[] args) {
        String str = "EWN";
        System.out.println(shortP(str));
    }
}
