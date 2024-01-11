import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/


class find_No {
    public static void main(String[] args) {
        int[] nums ={1,2,5,4,8,6,3,4,8};
        System.out.println(find(nums));

    }
    public static List<Integer> find(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correctIndex=nums[i]-1;
            if (nums[i]!=nums[correctIndex]){
                swapp(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    private static void swapp(int[] nums, int first, int second) {
        {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
}
