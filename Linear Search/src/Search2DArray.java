public class Search2DArray {
    public static void main(String[] args) {
//        int[][] arr={
//                {1,5,98,87},
//                {78,56,78},
//                {56,57,23},
//                {75,12}
//                };
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        //int target=57;
//        int[] ans = search(arr, target); //format of return value {row,col}
//        System.out.println(Arrays.toString(ans));
//
//    }
//    static int[] search(int[][] arr, int target) {
//        for (int row = 0; row < arr.length; row++) {
//
//            for (int col = 0; col < arr[row].length; col++) {
//
//                if (arr[row][col] == target) {
//                    return new int[]{row, col};
//                }
//            }
//
//        }
//        return new int[]{-1, -1};

//_________________________________________________________________________________________
                //Q:find max value

                int[][] arr={
                        {1,5,98,87},
                        {78,56,78},
                        {56,57,23},
                        {75,122}
                };

                System.out.println(max(arr));

            }
            static int max(int[][] arr) {
                int max = Integer.MIN_VALUE;
//                System.out.println(Integer.MIN_VALUE);

                for (int row = 0; row < arr.length; row++) {
                    for (int col = 0; col < arr[row].length; col++) {
                        if (arr[row][col] > max) {
                            max = arr[row][col];

                        }
                    }

                }
                return max;
//-------------------------------------------------------------------------------------------------



    }
}
