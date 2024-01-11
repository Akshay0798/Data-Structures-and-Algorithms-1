import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 3, 5, 2};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        countSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {
        int[] result = new int[arr.length + 1];
        // finding maximum element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            max = Math.max(max, arr[i]);

        // count array initializes
        int[] count = new int[max + 1];
        for (int i = 0; i < count.length; i++)
            count[i] = 0;

        // count of elements from a source array
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;

        // cumulative sum-position count
        for (int i = 1; i < count.length; i++)
            count[i] = count[i - 1] + count[i];

        //storing an element in the correct position
        for (int i = arr.length - 1; i >= 0; i--) {
            result[count[arr[i]]] = arr[i];
            count[arr[i]]--;
        }
        // copy a result array to a source array
        for (int i = 0; i < arr.length; i++)
            arr[i] = result[i];
    }
}
