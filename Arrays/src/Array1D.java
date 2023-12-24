import java.util.Arrays;

public class Array1D {
    //array is mutable,we can change
    public static void main(String[] args) {
        int[]nums={3,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] Suppu){
        Suppu[0]=1;
    }
}
