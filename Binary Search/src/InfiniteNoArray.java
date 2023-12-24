import static java.util.Arrays.binarySearch;
//Find the position of an element in a sorted array of infinite numbers

public class InfiniteNoArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,100,78,84,85,82,2};
        int target=10;
        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr, int target) {
        //first find the range
        //we will start from oth and 1st index then we will double..this is my approach

        int start = 0;
        int end = 1;
        //WHEN I WILL START, WHEN TARGET ELEMENT IS GREATER THAN END(1 2 3 4 5 6 7 8 9)
        //JUST FOR e.g. 1 IS START AND 2 IS END AND CONSIDER 8 IS TARGET
        //condition that target lie in the range
        while (target > arr[end]) {
            int TempStart = end + 1; //this is new start
            //double the box size
            //end = Previous end + sizeofbox *2

            end = end + (end - start + 1) * 2;
            //(end-start+1)-> in that end =whole array [e-(s-1)-> (e-s+1)](1:55 MIN TIME RANGE FOR EXPLANATION)
            start = TempStart;
        }

        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //find the middle element
            // int mid = (start + end)/2..it might be exeed
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

