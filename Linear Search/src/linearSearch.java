public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {2, -55, 55, 856, 7, 62, 62, 85, -1, 895, 31325};

        int target = -2;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
        
        boolean ans2=LinearSearch2(nums,target);
        System.out.println(ans2);
    }
    
    /*searching the array:return the index if item found
    otherwise if item not found return -1*/
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        //run for loop
        for (int index = 0; index < arr.length; index++) {
            //check the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                //return index;
                return arr[index];
            }
        }
        /*this line will execute if none of the return statements above have executed
        hence the target not found*/
        return Integer.MIN_VALUE;
    }

    static boolean LinearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        //run for loop
        for (int element : arr) {
            //check the element at every index if it IS = target
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return false;
    }

}
