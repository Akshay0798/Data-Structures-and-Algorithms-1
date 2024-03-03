public class AllPathMazeBacktracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        findAndPrintAllPaths("", maze, 0, 0); // Starting from (0, 0)
    }
    static void findAndPrintAllPaths(String currentPath, boolean[][] maze, int row, int column) {
        // Check if we reached the bottom-right corner
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(currentPath);
            return;
        }
        // Check if the current cell is blocked
        if (!maze[row][column]) {
            return;
        }
        // Mark the current cell as visited
        maze[row][column] = false;

        // Explore paths in all four directions
        // Down
        if (row < maze.length - 1) {
            findAndPrintAllPaths(currentPath + 'D', maze, row + 1, column);
        }
        // Right
        if (column < maze[0].length - 1) {
            findAndPrintAllPaths(currentPath + 'R', maze, row, column + 1);
        }
        // Up
        if (row > 0) {
            findAndPrintAllPaths(currentPath + 'U', maze, row - 1, column);
        }
        // Left
        if (column > 0) {
            findAndPrintAllPaths(currentPath + 'L', maze, row, column - 1);
        }
        // Mark the current cell as unvisited before backtracking
        maze[row][column] = true;
        //this line is where the function will be over
        //so before the function gets remove also remove the change that were made by that function
    }
}


//marking false == i have that cell in my current path, so when that path over
//e.g.u r in another recursion call those r cells should not be false
//then what we do: while you are moving back, we restore the maze as it was
//when we go back: when function is return
//when u come out of the recursive function or going back we remark the cell is True
//you are making some changes while going in the below recursion call,so when u go outside those recursion call the changes is made by those recurtion call should also not be available