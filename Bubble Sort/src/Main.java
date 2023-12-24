import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []arr={3,4,5,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void bubble(int[] arr){
        boolean swap;
        //run the step n-1 time
        for (int i = 0; i < arr.length; i++) {
            swap=false;//swap zalach nahi ter directly go into a break statement
            //i=0 chya case madhe swap zalach nahi ter array already sorted
            //i=1 we wil not check
            //for each step, max item will be coming at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }
    }
}