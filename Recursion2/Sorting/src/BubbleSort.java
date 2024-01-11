import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        Bubble_Sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void Bubble_Sort(int[] arr,int row,int column) {
        if (row == 0) {
            return;
        }
        if (column < row){
            if (arr[column] > arr[column + 1]) {
            //swap
                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;
            }
            Bubble_Sort(arr, row, column + 1);
        }
        else{
            Bubble_Sort(arr,row-1,0);
        }

    }
}
