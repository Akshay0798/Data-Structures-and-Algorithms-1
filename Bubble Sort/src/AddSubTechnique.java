import java.util.Arrays;

public class AddSubTechnique {
    public static void main(String[] args){
        int [] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    //Using addition subtraction technique
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j] -arr[j+1];
                    arr[j] = arr[i]-arr[j+1];
                }
            }
        }
    }
}

//a = a+b;
//b = a-b;
//a = a-b;

//a = a^b
//b = a^b
//a = a^b



