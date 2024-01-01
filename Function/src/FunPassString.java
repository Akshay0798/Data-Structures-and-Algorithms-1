import java.util.Scanner;

public class FunPassString {
    public static void main(String[] args) {

        //By Scanner method
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre Your Name: ");
        String naam = sc.next();
        String personalised =mygreet(naam);
        System.out.println(personalised);
    }


        //Normal Method
//        String personalised = mygreet("Suppu");
//        System.out.println(personalised);
//    }

    private static String mygreet(String name) {
        String message = "I Love You " + name ;
        return message;

    }

}
