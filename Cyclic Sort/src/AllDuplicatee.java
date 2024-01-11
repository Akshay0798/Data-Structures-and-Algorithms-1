//https://leetcode.com/problems/find-all-duplicates-in-an-array/
/*
import java.util.ArrayList;
import java.util.List;

public class AllDuplicatee {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    i++;
                }
            }
            List<Integer> Ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                    Ans.add(arr[index]);
                }
            }
            return Ans;
        }
        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
*/



