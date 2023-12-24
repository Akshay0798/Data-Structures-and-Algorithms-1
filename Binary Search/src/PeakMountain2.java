public class PeakMountain2 {
    public static void main(String[] args) {
        int[] Arr={0,1,2,3,4,5,2,1};
        System.out.println(peakIndexMountainArray(Arr));
    }
    static int peakIndexMountainArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > Arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}
