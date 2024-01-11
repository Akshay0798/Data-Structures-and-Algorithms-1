import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateSubset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
        //when u find a duplicate element, only add it in the newly created subset in the previous steps
        //bcoz of above point duplicate have to be together
        //for that we have to sort an array
    private static List<List<Integer>> subsetDuplicate ( int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0; //initially start is zero
            //if current and previous element is same, s=e+1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int size = outer.size();
            for (int j = start; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
        }
    }
