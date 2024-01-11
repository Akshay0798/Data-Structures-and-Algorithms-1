import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        int[]arr={40,48,47,484,0,44,54,84,4888};
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        int maxval = arr[0]; //we assume array is not empty
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxval){
                maxval=arr[i];
            }
        }
        return maxval;

//_____________________________________________________________________________________
//
//        int[]arr={40,38,41,484,0,44,54,84,4888};
//        System.out.println(maxRange(arr, 0, 2));
//    }

//    static int maxRange(int[] arr, int start, int end) {
//        int maxval = arr[start]; //we assume maximum value is not empty
//        for (int i = start; i <= end; i++) {
//            if(arr[i] > maxval){
//                maxval=arr[i];
//            }
//        }
//        return maxval;
//-------------------------------------------------------------------------------

//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[5];
//
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(maxRange(arr, 0, 2));
//    }
//
//    static int maxRange(int[] arr, int start, int end) {
//        int maxval = arr[start]; //we assume the maximum value is not empty
//        for (int i = start; i <= end; i++) {
//            if (arr[i] > maxval) {
//                maxval = arr[i];
//            }
//        }
//        return maxval;
//
    }
}
