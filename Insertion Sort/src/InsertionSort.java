import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertion(int[] arr) {
        int N= arr.length;
        for (int i = 0; i <= N-2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}