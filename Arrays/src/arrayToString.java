import java.util.Arrays;
import java.util.Scanner;

public class arrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] suppu = new int[5];

//        for (int i = 0; i < suppu.length; i++) {
//                suppu[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(suppu));

        //modify
//        suppu[1] =100;
//        System.out.println(Arrays.toString(suppu));
//__________________________________________________________________________________

        String[]sweetu = new String[5];

        for (int j = 0; j < sweetu.length; j++) {
            sweetu[j]=sc.next();
        }
        System.out.println(Arrays.toString(sweetu));

        //modify
        sweetu[1] = "Bujjinannu";
        System.out.println(Arrays.toString(sweetu));
    }
}