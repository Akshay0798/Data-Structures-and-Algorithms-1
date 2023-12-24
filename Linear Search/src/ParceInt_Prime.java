//Not a Linear search Problem;
import java.util.Scanner;

public class ParceInt_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n=Integer.parseInt(sc.nextLine()); //if we have to take int and string in the same program.
//        String name=sc.nextLine();
//
//        System.out.println("Dear " + name + " your counting start from 1 to");
//        for (int i = 1; i <=n ; i++) {
//            System.out.println(i);
//
//        }

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number/2; i++) { //Math.sqrt(number)=number/2
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}



