import java.util.ArrayList;

public class MazeSolver {
    public static void main(String[] args) {
        // Example usage
        System.out.println(countPaths(3, 3));
        printPaths("", 3, 3);
        System.out.println(findPaths("", 3, 3));
        System.out.println(findDiagonalPaths("", 3, 3));
    }

    // Count the number of paths from top-left to bottom-right in a grid
    static int countPaths(int rows, int columns) {
        if (rows == 1 || columns == 1) {
            return 1;
        }
        int leftPaths = countPaths(rows - 1, columns);
        int topPaths = countPaths(rows, columns - 1);
        return leftPaths + topPaths;
    }

    // Print all possible paths from top-left to bottom-right in a grid
    static void printPaths(String path, int rows, int columns) {
        if (rows == 1 && columns == 1) {
            System.out.println(path);
            return;
        }
        if (rows > 1) {
            printPaths(path + 'D', rows - 1, columns); // Move Down
        }
        if (columns > 1) {
            printPaths(path + 'R', rows, columns - 1); // Move Right
        }
    }

    // Return all possible paths from top-left to bottom-right in a grid
    static ArrayList<String> findPaths(String path, int rows, int columns) {
        if (rows == 1 && columns == 1) {
            ArrayList<String> singlePath = new ArrayList<>();
            singlePath.add(path);
            return singlePath;
        }

        ArrayList<String> paths = new ArrayList<>();
        if (rows > 1) {
            paths.addAll(findPaths(path + 'D', rows - 1, columns)); // Move Down
        }
        if (columns > 1) {
            paths.addAll(findPaths(path + 'R', rows, columns - 1)); // Move Right
        }
        return paths;
    }

    // Return all possible paths (including diagonal) from top-left to bottom-right in a grid
    static ArrayList<String> findDiagonalPaths(String path, int rows, int columns) {
        if (rows == 1 && columns == 1) {
            ArrayList<String> singlePath = new ArrayList<>();
            singlePath.add(path);
            return singlePath;
        }

        ArrayList<String> paths = new ArrayList<>();
        if (rows > 1 && columns > 1) {
            paths.addAll(findDiagonalPaths(path + 'D', rows - 1, columns - 1)); // Diagonal Move
        }
        if (rows > 1) {
            paths.addAll(findDiagonalPaths(path + 'V', rows - 1, columns)); // Move Down
        }
        if (columns > 1) {
            paths.addAll(findDiagonalPaths(path + 'H', rows, columns - 1)); // Move Right
        }
        return paths;
    }
}
