public class spiralMatrix {
    public static void spiral(int arr[][]){
        int sRow = 0;
        int sCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(sRow <= endRow && sCol <=endCol){
            //top
            for(int j = sCol; j <= endCol; j++){
                System.out.print(arr[sRow][j] + " ");
            }
            //right
            for(int i =sRow +1; i<=endRow; i++){
                System.out.print(arr[i][endCol] + " ");
            }
            //bottom
            for(int j = endCol-1; j>=sCol; j--){
                if(sRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            //left
            for(int i = endRow -1; i>=sRow+1; i--){
                if(sCol== endCol){
                    break;
                }
                System.out.print(arr[i][sCol]+ " ");
            }
            sRow++;
            sCol++;
            endRow--;
            endCol--;
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
       spiral(arr);
    }
}
