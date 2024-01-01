import java.util.Scanner;

public class fuctionMain {
    public static void main(String[] args) {

//        sum(); //it is function call...whatever the value is written function call return the value
//    }
//------------------------------------------------------------------------------------------------------------

        int ans = sum2();
        System.out.println("return value " + ans);

    }

    static int sum2() {   //why static int.bcoz we're returning integer
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int total = num1 + num2;
        return total;

//_______________________________________________________________________________
//    static void sum(){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        int total = num1 + num2;
//        System.out.println("return sum function " + total);
//    }

//_______________________________________________________________________

    /* access modifier , return_type name , (){
     //body
     return statement;
     }
     */
//______________________________________________________________________________
        //pass the value of number when u r calling the method in main()


    }
}





