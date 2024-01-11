//https://leetcode.com/problems/missing-number/
//Incomplete
import java.util.Arrays;

class MissingNo {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        MissingNo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int MissingNo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }

        }
        return -1;

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
