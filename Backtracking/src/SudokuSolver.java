public class SudokuSolver {
    public static void main(String[] args) {
        int [][] board=new int[][]{
                { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
                { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
                { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
                { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
                { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
                { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
                { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
                { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
                { 7, 4, 5, 0, 8, 6, 3, 1, 0 }};
        if (solve(board)){
            display(board);
        }else {
            System.out.println("Not able to solve");
        }

    }
    static boolean solve(int[][] board){
        int n= board.length;
        int row=-1;
        int col=-1;

        boolean EmptyLeft= true;

        //this is
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]== 0){
                    row = i;
                    col = j;
                    EmptyLeft=false;
                    break;
                }
            }
            //while traverse if u found some empty element int row, them break
            if (EmptyLeft== false){
                break;
            }
        }
        if (EmptyLeft == true){
            return true;
            //sudoku solve
        }
        //backtrack
        for (int number = 0; number <= 9; number++) {
            if (isSafe(board,row,col,number)){
                board[row][col] = number;
                if (solve(board)){
                    //found the ans
                    return true;
                }else {
                    //backtrack
                    board[row][col]=0;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for (int [] row : board) {
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board,int row,int col,int num){
        //check the complete row
        for (int i = 0; i < board.length; i++) {
            //check the number is in row or not
            if (board[row][col] == num){
                return false;
            }

        }
        //check the complete col
        for (int [] numbers : board) {
            //check the number is in row or not
            if (numbers[col] == num){
                return false;
            }
        }
        //check the grid 3*3
        int sqrt=(int)(Math.sqrt(board.length));
        int rowStart = row-row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt ; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
//TC:o(9^n^^2)
//SC:o(n^2)
