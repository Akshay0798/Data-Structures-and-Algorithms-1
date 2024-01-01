import java.util.Arrays;

public class ChangeValueByArray {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,3,4,5,78}; //arr is a object (arr is a reference variable)
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0]=99;
    //if u make a change object via this ref veriable ,same object will be change
    }
}
