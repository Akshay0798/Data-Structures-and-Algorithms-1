public class FloorOfNumber {
    public static void main(String[] args) {
        //floor=the biggest number smaller or equal to target number(Target nahi mila to usse chota number)
        int[] arr = {1,3,5,9,10,15,19,22,25,29};
        int target = 11;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    static int Floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length-1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }

        }
        return arr[end];
    }
}
