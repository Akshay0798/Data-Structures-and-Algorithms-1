import java.util.Arrays;

public class PathMazeCount {
    public static void main(String[] args) {
        boolean[][] board= {{true,true,true},
                            {true,true,true},
                            {true,true,true},
                            };
        int[][] path=new int[board.length][board[0].length];
        AllPathPrint("", board,0,0,path,1);
    }
    static void AllPathPrint(String process, boolean[][] maze, int r, int c, int[][] path, int steps) { //r=row;c=column
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]= steps;

            for(int[] arr:path){ //for int array in a path
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(process);
            System.out.println();
            return;
        }
        if (!maze[r][c]) { //maze[r][c] == false
            return;
        }
        //but if is not false
        //i m considering this block in my maze
        maze[r][c]=false;
        //adding ans in path
        path[r][c]= steps;

        if (r < maze.length - 1) {
            AllPathPrint(process + 'D', maze, r + 1, c, path, steps+1);
        }

        if (c < maze[0].length - 1) {
            AllPathPrint(process + 'R', maze, r, c + 1, path, steps+1);
        }

        if (r > 0) {
            AllPathPrint(process + 'U', maze, r - 1, c, path, steps+1);
        }

        if (c > 0) {
            AllPathPrint(process + 'L', maze, r, c - 1, path, steps+1);
        }
        maze[r][c]=true;
        //when u returning steps will be zero
        path[r][c]= 0;
        //this line is where the function will be over
        //so before the function gets remove also remove the change that were made by that function
    }

}
