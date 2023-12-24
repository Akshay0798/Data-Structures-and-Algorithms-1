//https://leetcode.com/problems/peak-index-in-a-mountain-array

public class PeakMountain {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,2,1};
        System.out.println(peakIndexMountainArray(arr));
    }
    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you're in the dec part of array
                //this may be the ans but look at the left
                //this is why end !=mid-1
                end = mid;
            } else {
                //you are in ascending part of array
                //because we know mid+1 > mid-element
                start = mid + 1;
            }
        }
        return arr[start];

        //in the end ,start ==end and pointing towards the largest number bcoz of the two method above
        //They're trying to find the max element in the above 2 methods
        //hence they are pointing just one element which is maximum this is what methods say
        //more elaboration:at every point of time for start and end they have the best possible ans till dark time
        //if we are saying that only 1 item is remaining bcoz of above line that is a best line
    }
}


