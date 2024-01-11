import java.util.ArrayList;

public class Find_Both_idx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5, 8, 5, 96, 5, 9};
//        Find_AllIndex(arr, 5, 0);
//        System.out.println(list);
        ArrayList<Integer> ans=Find_AllIndexx(arr, 5, 0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void Find_AllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return; //we are not returning so it will be void
        }
        if (arr[index] == target) {
            list.add(index); //when u find out ans just add in array
        }
        Find_AllIndex(arr, target, index + 1);
    }
    //------------------------------------------------------------------------------------------------
    //things u add inside the parameter that basically means it will be passed in 2 function call(for future function call)
    //things u add inside the function body it will be only available for that function call
    //if we have to written list return function also will be  list
    //we added a object by different reference veriable
    static ArrayList Find_AllIndexx(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list; //we are not returning so it will be void
        }
        if (arr[index] == target) {
            list.add(index); //when u find out ans just add in array
        }
        return Find_AllIndexx(arr, target, index + 1,list);

    }

}
