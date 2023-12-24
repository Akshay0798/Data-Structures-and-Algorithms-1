public class FindMinNum {
    public static void main(String[] args) {
        int []arr={10,20,30,40,85,6,45,78};
        System.out.println(min(arr));
    }
    //assume arr.length!=0
    //return the minium value in the array
    static int min(int[]arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
