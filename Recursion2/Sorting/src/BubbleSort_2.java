import java.util.Arrays;

public class BubbleSort_2 {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        Bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void Bubble(int[] arr,int n){
        if (n==1){
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        Bubble(arr,n-1);
    }
}
