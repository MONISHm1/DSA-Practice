public class knightTour {
    public static void printChess(char board[][]){
        System.out.print("XXXXXXXXXXXXXXX[chess-board]XXXXXXXXXXXXXXXX");
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
                
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;

        // Check all 4 possible previous knight positions

        // (-2, -1)
        if (row - 2 >= 0 && col - 1 >= 0) {
            if (board[row - 2][col - 1] == 'K') return false;
        }

        // (-2, +1)
        if (row - 2 >= 0 && col + 1 < n) {
            if (board[row - 2][col + 1] == 'K') return false;
        }

        // (-1, -2)
        if (row - 1 >= 0 && col - 2 >= 0) {
            if (board[row - 1][col - 2] == 'K') return false;
        }

        // (-1, +2)
        if (row - 1 >= 0 && col + 2 < n) {
            if (board[row - 1][col + 2] == 'K') return false;
        }

        return true;
    }

    public static void placeKinght(char board[][], int row, int col, int knightPlaced){
        int n = board.length;
        if(knightPlaced == n){
            // printChess(board);
            count++;
            return;
        }
        if(row == n){
            return;
        }
       if(col == n ){
         placeKinght(board, row+1, 0, knightPlaced);
         return;
       }

       if(isSafe(board,row,col)){
        board[row][col] = 'K';
        placeKinght(board, row, col+1, knightPlaced+1);
        board[row][col] = 'X';
       }
       placeKinght(board, row, col+1, knightPlaced);
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i =0; i< n; i++){
        for (int j =0; j< n; j++){
            board[i][j] = 'X';
        }
        }
        placeKinght(board, 0, 0, 0);
        System.out.println("total ways to solve kight = " + count);
    }
}
