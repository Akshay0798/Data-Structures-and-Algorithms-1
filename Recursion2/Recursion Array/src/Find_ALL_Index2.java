import java.util.ArrayList;

public class Find_ALL_Index2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5};
        System.out.println(Find_AllIndex2(arr,5,0));

    }
    static ArrayList Find_AllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        //this will contain ans for that function call only
        if (arr[index] == target) {
            list.add(index); //when u find out ans just add in array
        }
        ArrayList<Integer> AnsFor_BelowCalls=Find_AllIndex2(arr, target, index + 1);
        list.addAll(AnsFor_BelowCalls);
        return list;
    }
}
