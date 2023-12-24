public class OrderAgnosticBinSearch {
    public static void main(String[] args) {
        int[]arr={99,80,75,64,56,46,0,-30,-56,-84,-86,-100};
        int target = 99;
        int ans = AgnosticSearch(arr , target);
        System.out.println(ans);
    }

    static int AgnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find out whether is ascending or descending order
        boolean ItsAscending;
        if (arr[start] < arr[end]) {
            ItsAscending = true;
        } else {
            ItsAscending = false;
        }

        while (start <= end) {
            //find the middle element
            // int mid = (start + end)/2..it might be exceed
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (ItsAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
