import java.util.Arrays;

@SuppressWarnings("ALL")
public class CealingOfNumber {
    //ceiling=smallest element in array greater than equal to target(target nahi mila to usse bada number)
    public static void main(String[] args) {
        int[] arr ={3,6,9,12,15,18,21,24,27,30};
        int target=17;
        int ans=cealing(arr,target);
        System.out.println(ans);
    }

    static int cealing(int[] arr, int target) {
        //what if target is greater than greatest number in that array
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=start+ (end-start)/2;

            if (target < arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return arr[start];
    }
}

//cealing means smallest number >=target
