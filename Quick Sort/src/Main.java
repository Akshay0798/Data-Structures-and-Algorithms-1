import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] nums,int low,int high){
        if (low >= high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        while (s <= e){
            // Advantages - if its already sorted it will not sort
            while (nums[s] < pivot){ //if this condition true
                s++;                  //move forward
            }
            while(nums[e] > pivot){ //if this condition true
                e--;                 //move backward
            }
            //but at some point can be possible while moving pointer s > e [1 3 5 2 10] start can be 2 and end can be 5 so

            if (s <= e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                //swap karach aani samor jaicha
                s++;
                e--;
            }
        }
        //now my pivit at my correct index,pls sort now two half
        QuickSort(nums,low,e);
        QuickSort(nums,s,high);
    }
}
//if pivit element 1st or last element,1 of the part empty so very less steps is reduce
//TC : O(n^2) - worst case
//TC : O(nlogn)- AVg case or best case