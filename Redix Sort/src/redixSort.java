import java.util.*;
import java.lang.*;


class RadixSort {
    public static void main(String[] args) {
        // driver code
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };

        System.out.println("Before Sort: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Before Sort: " + Arrays.toString(arr));
    }
    // get maximum element from array
    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currNum = arr[i];
            max = Math.max(currNum, max);
        }
        return max;
    }

    // count sort
    public static void countSort(int[] arr, int max, int exp){
        int[] count = new int[10];
        Arrays.fill(count, 0);
        int[] output = new int[arr.length];
        int temp;

        // for digit
        for(int i = 0; i<arr.length; i++){
            temp = arr[i];
            count[(temp/exp)%10]++;
        }
        // cumulative sum - position count
        for(int i=1; i<count.length; i++)
            count[i] = count[i] + count[i-1];

        // build an output array
        for(int i=arr.length-1; i>=0; i--){
            temp = arr[i];
            output[count[(temp/exp)%10]-1] = arr[i];
            count[(temp/exp)%10]--;
        }

        // copy an output array to an original array
        for(int i=0; i<arr.length; i++)
            arr[i] = output[i];
    }

    // radix sort (driving function)
    public static void radixSort(int[] arr){
        int max = getMax(arr);
        for(int exp = 1; max/exp > 0; exp = exp * 10)
            countSort(arr, max, exp);
    }


}