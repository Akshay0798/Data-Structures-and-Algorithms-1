public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -4, -2, 0, 2, 12, 15, 23, 55, 88, 456};
        int target = 2;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            //find the middle element
            // int mid = (start + end)/2..it might be exceeded
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                end=mid-1;
            }
            else if (target > arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
