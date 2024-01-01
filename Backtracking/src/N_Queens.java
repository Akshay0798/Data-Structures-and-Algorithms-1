public class N_Queens {
    public static void main(String[] args) {
        int n=4;
        boolean[][]board=new boolean[n][n];
        System.out.println(queens(board,0));
    }
    static int queens(boolean[][] board,int row){//true means queens are place
        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
            }
        int count=0;
        //placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if (isSafe(board,row,col)){
                board[row][col]=true;
                count += queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        //board[i][col]=true, means this is not safe pace for queens so return false
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        //diagonal left
        int MaxLeft = Math.min(row, col);
        for (int i = 1; i <= MaxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        //diagonal right
        int MaxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= MaxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true; //if none of he checks false, then Answer true
    }

    private static void display(boolean[][] board) {
        for (boolean[]row: board) {
            for (boolean element :row){
                if (element){
                    System.out.print("Q ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
/*
Recurrence relation
We use akrabaji formula
T(N)=N * T(N-1) + O(N^2)
O(N^3 + N!)=O(N!)
*/

