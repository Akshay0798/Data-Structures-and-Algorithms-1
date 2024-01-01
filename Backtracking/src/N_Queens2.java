import java.io.BufferedReader;
import java.io.InputStreamReader;


public class N_Queens2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (chess[row][col] == 0
                    && isQueenSafe(chess, row, col) == true) {
                chess[row][col] = 1;
                printNQueens(chess,
                        qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isQueenSafe(int[][] chess, int row, int col) {
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0
                && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int j = col - 1; j >= 0; j--) {
            if (chess[row][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
