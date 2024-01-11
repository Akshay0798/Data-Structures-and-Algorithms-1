import java.util.ArrayList;
import java.util.List;

public class SubsetNormalWay {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    //I know I have to return a list of list
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            //when outer size is 2, 2 lists are created
            int size= outer.size();
            for (int i = 0; i < size; i++) {
                //we add this number in an original list,for adding we create a new list
                List<Integer> internal=new ArrayList<>(outer.get(i)); //for create a copy in an ith list
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
//TC:O(N * 2^N) - 2^N NO. OF SUBSET
//SC:O(2^N * N) - 2^N(TOTAL SUBSET);N(SPACE TAKEN BY EACH SUBSET)
