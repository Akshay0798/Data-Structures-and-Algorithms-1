import java.util.Arrays;

import static java.util.Collections.reverse;

public class swapping {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        swap(arr, 1, 3);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;

//--------------------------------------------------------------------

        int[] arr={22,33,44,55,66,100};
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //swapping
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}