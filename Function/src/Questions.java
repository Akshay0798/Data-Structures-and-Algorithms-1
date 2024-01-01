import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        // Print 1 to 1000 Armstrong number

        for (int i = 0; i < 1000; i++) {
            if (IsArmstrong(i)){
                System.out.print(i + " ");
            }
        }


//        System.out.println(IsPrime(n));
//
//    }
//    static boolean IsPrime(int n){
//        if ( n<=1){
//            return false;
//        }
//        int c=2;
//        while (c*c<=n){
//            if (n % c==0){
//                return false;
//            }
//            c++;
//        }
//        if (c *c >n){
//            return true;
//        }
//        return false;
//__________________________________________________________________________

        //print all 3 digit armstrong number
       // System.out.println(IsArmstrong(n));

    }
    static boolean IsArmstrong(int n){
        int original_value = n;

        int sum = 0;
        while (n>0) {
            int reminder = n % 10;
            n = n / 10;
            sum = sum + reminder * reminder * reminder;
        }

        if (sum == original_value) {
            return true;
        }
        return false;
    }
          //return sum == original_value; (shortcut)
}


