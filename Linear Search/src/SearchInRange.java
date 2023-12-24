public class SearchInRange {
    public static void main(String[] args) {

        int[] arr={18,12,-85,5,52,36,72,-45,-9};
        int target = -85;
        System.out.println(LinearSearch(arr, target, 1, 5));

    }
    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;
    }
}
