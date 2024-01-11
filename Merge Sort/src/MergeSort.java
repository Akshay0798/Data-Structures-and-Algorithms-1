import java.util.Arrays;
@SuppressWarnings("ALL")

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 4, 2, 1};
        int n = arr.length;
        devide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void devide(int[] arr, int start, int end) {
        if (start >= end) { //hamare pass single element aa gaya he/array khatam ho gaya he
            return;
        }
        int mid = start + (end - start) / 2;
        devide(arr, start, mid);
        devide(arr, mid + 1, end);

        //we have to sort also
        sort_conquer(arr, start, mid, end);
    }
    private static void sort_conquer(int[] arr, int start, int mid, int end) {
        //we  indexing in 0 & ending index hamesha total length se kam hota he
        int[] merge = new int[end - start + 1];
        int idx1 = start; //its track 1st array
        int idx2 = mid + 1; //its track 2nd array
        int x = 0; //its track merge index
        
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x] = arr[idx1]; //it compares both and less numb index go in a merge array
                x++;
                idx1++;  //increase for next element
            } else {
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        //bache hue element ko vaise ke vaise copy karne ke liye
        while (idx1 <= mid){
            merge[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= end){
            merge[x] = arr[idx2];
            x++;
            idx2++;
        }
        //original array ke ander merge array ke element ko copy karna he
        for(int k=0;k < merge.length; k++){
            arr[start + k]=merge[k];
        }
    }
}
//TC = O(nlogn)
