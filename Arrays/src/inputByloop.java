import java.util.Scanner;

public class inputByloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 13;
        arr[3] = 18;
        arr[2] = 15;
        arr[4] = 12;

        System.out.println(arr[0]);

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); //takes input from user and store in arr[i](store in i)
            //System.out.println(arr[i]); //its will give output only 5 bcoz we gave size only 5
        }

        for (int num : arr) { //every element(own number not indices) of an array print the element
            System.out.println(num + " ");  //here num represent an element of the array
        }

    }
}
