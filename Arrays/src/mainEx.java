import java.util.Scanner;

public class mainEx {
    public static void main(String[] args) {
    /*
    Syntax
    datatype [] variable Name = new datatype [size]

    If we have to store 5 roll number
        int[] roll_No = new int[5];
    OR directly
        int[] rollNo = {10,20,30,40,50};

        int[] rollNo; //declaration of array. rollNo is getting defined in the stack
        rollNo = new int[5]; //initialisation. actually it object is being created in the memory(heap memory)
        System.out.println(rollNo[2]);
        String[] arr=new String[10];
        System.out.println(arr[8]);
        int[]arre=new int[5];
        arre[0]=10;  //what element at the zero index
        arre[1]=13;
        arre[3]=18;
        arre[2]=15;
        arre[4]=12;

        System.out.println(arre[5]);
    */

        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
//        1st way(array format)
//        System.out.println(Arrays.toString(arr));

//        2nd way
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        3rd way
        for (int num : arr){ //every element(own number not indices) of array print the element
            System.out.println(num + " ");  //here num represent element of the array
        }

    }
}
