public class KnightTour {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knightTour(board, 0, 0, 8);
    }

    // Main function to find Knight's Tour
    static void knightTour(boolean[][] board, int row, int col, int knights) {
        // If all knights are placed, display the board
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        // Check if the current position is at the end of the board
        if (row == board.length - 1 && col == board[0].length) {
            return;
        }

        // Move to the next row if the end of the current row is reached
        if (col == board[0].length) {
            knightTour(board, row + 1, 0, knights);
            return;
        }

        // Check if placing a knight at the current position is safe
        if (isSafe(board, row, col)) {
            // Place the knight and explore further
            board[row][col] = true;
            knightTour(board, row, col + 1, knights - 1);

            // Backtrack: Remove the knight to explore other possibilities
            board[row][col] = false;
        }

        // Explore other positions in the same row
        knightTour(board, row, col + 1, knights);
    }

    // Check if placing a knight at the current position is safe
    private static boolean isSafe(boolean[][] board, int row, int col) {
        int[][] moves = {{-2, -1}, {-1, -2}, {-2, 1}, {-1, 2}};
        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (isValid(board, newRow, newCol) && board[newRow][newCol]) {
                return false;
            }
        }
        return true;
    }

    // Check if the position is within the board boundaries
    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }

    // Display the current state of the chessboard
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K "); // Knight is present
                } else {
                    System.out.print("_ "); // Empty cell
                }
            }
            System.out.println();
        }
    }
}
