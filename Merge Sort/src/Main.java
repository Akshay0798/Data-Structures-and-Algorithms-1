import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr={5,4,6,7,3,8,5,0};
        int[] NewArr=mergeSort(arr); //it creates a new array.original array is not modifying
        System.out.println(Arrays.toString(NewArr));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr; //when only single element left ,we cant break single element so simply return
        }
        int mid= arr.length/2;

        //it's creating new object for every function call
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));//mid is excluded
        
        return mergeSort(left,right);
    }

    private static int[] mergeSort(int[] left, int[] right) {
        int[] mix=new int[left.length + right.length];
        int i=0;//its pointer for leftside array
        int j=0;//its pointer for rightside array
        int k=0; //its pointer for new array

        while (i< left.length && j< right.length){
            if (left[i] < right[j]){ //doghanpaiki jo pan chota aahe to add hoel
                mix[k]= left[i];
                i++; //pointer samor hoel
            }else{
                mix[k]= right[j];
                    j++;
            }
            k++;
        }
        //it may be possible one of the array(left or right) is not complete
        //its copy the remaining element
        while(i< left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }

}