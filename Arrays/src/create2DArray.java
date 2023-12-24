import java.util.Scanner;

public class create2DArray {
    public static void main(String[] args) {
//        int[][] suppu= {
//                {14, 22, 36},
//                {46, 52, 67, 70},
//                {76, 84, 93, 10, 11},
//                {50},
//                        };
//        for (int row = 0; row < suppu.length; row++) {
//            for (int col = 0; col < suppu[row].length ; col++) {
//                //its shows how many column in rows
//                System.out.print(suppu[row].length + " column available--> ");
//
//                System.out.print(suppu[row][col] + " ");
//            }
//            System.out.println();

//        --------------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int[][] suppu = new int[rows][];

        for (int row = 0; row < rows; row++) {
            System.out.print("Enter the number of columns for row " + (row + 1) + ": ");
            int cols = scanner.nextInt();

            suppu[row] = new int[cols];

            System.out.println("Enter the elements for row " + (row + 1) + ":");
            for (int col = 0; col < cols; col++) {
                suppu[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < suppu.length; row++) {
            for (int col = 0; col < suppu[row].length; col++) {
                //System.out.print(suppu[row].length + " ");
                System.out.print(suppu[row][col] + " ");
            }
            System.out.println();
        }
    }
}
