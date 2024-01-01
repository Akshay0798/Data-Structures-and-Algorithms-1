public class MazeObstacle {
    public static void main(String[] args) {
        boolean[][] river= {{true,true,true},
                            {true,false,true},
                            {true,true,true}};
        pathObstacle("", river,0,0);//starting from 0

    }
    static void pathObstacle(String process, boolean[][] obstacle, int r, int c) {
        if (r == obstacle.length-1 && c== obstacle[0].length-1) {
            System.out.println(process);
            return;
        }
        if (!obstacle[r][c]){
            return;
        }
        if (r < obstacle.length-1) {
            pathObstacle(process + 'D',obstacle,r + 1, c);

        }
        if (c < obstacle[0].length-1) {
            pathObstacle(process + 'R',obstacle, r, c + 1);
        }
    }
}
