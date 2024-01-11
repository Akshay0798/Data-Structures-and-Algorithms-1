import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /* number is Prime or not */
//        System.out.println(IsPrime(n));
        System.out.println(isPrime(11));
        
        /* number is ArmStrong or not */
//        System.out.println(IsArmstrong(n));
        
        /*print armStrong No 1 to 1000*/
//        PrintArmStrong(1000);
    }
    static boolean IsPrime(int n){
        if ( n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n % c==0){
                return false;
            }
            c++;
        }
        if (c * c >n){
            return true;
        }
        return false;
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
//        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
    
    static void PrintArmStrong(int n){
        for (int i = 0; i < 1000; i++) {
            if (IsArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}


