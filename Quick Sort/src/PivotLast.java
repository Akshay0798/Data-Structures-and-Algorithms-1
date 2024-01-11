public class PivotLast {
    public static void main(String[] args) {
    int[] arr={5,4,3,1,2};
    int n= arr.length;
    QuickSort(arr,0,n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void QuickSort(int []arr,int low, int high){
        if (low < high){
            int piIdx=partition(arr,low,high);

            QuickSort(arr,low,piIdx-1);
            QuickSort(arr,piIdx+1,high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivit=arr[high];
        //i will track how many element will come ,lower than pivit,its tracking empty spaces
        int i=low-1;

        for (int j = low; j < high; j++) {
            if (arr[j]< pivit){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivit;
        arr[high]=temp;
        return i; //return pivit index

        //TC -Worst case:O(n ^ 2)
        //Avg:O(nlogn)

    }

}
