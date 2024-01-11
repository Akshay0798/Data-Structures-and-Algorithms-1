import java.sql.SQLOutput;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,0};
        Selection(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[]arr,int row, int column,int max){
        if(row==0){
            return;
        }
        if (column < row){
            if (arr[column]>arr[max]){
                //here we consider max= 0th index(0th column) is maximum value & column is column+1
                Selection(arr,row,column+1,column);
            }else{
                Selection(arr,row,column+1,max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            Selection(arr,row-1,0,0);
        }

    }
}
