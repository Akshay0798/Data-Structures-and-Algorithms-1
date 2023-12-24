import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr={5,4,8,6,32,7,80};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in an array and swap with the correct index
            int last= arr.length-i-1;
            //for swapping max index
            int maxidx = getMaxIndex(arr,0,last);
            swap(arr,maxidx,last);
        }
    }
    //we will get maximum value with this
    static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    //function for swapping
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}