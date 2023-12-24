import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        2D arrays

            1 2 3
            4 5 6
            7 8 9
       */
        //2d arrays show like [][]
        //int[][] arr = new int[3][3];     //column is not necessary

//        int[][]arre = {
//                {4 ,5 ,6},  //0th index
//                {1 ,2 ,3},   //1st index
//                {7 ,8 ,9, 7}    //2nd index
//                };
//        System.out.println(Arrays.toString(arre[2])); //output-->[7 ,8 ,9 ,7]

//----------------------------------------------------------------------------------------
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // it will give no. of rows

        //input
        for (int row = 0; row < arr.length; row++) {  //arr.length shows the size of row its([3])
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); //it's just a new line
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); //it's just a new line
        }
    }
//        matrix format
//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        //enhance for loop
//        for (int[] suppu : arr) {
//            System.out.println(Arrays.toString(suppu));
//        }

}
