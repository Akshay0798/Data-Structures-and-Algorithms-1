import java.util.Scanner;

public class Newton {
    public static void main(String[] args) {
//        System.out.println('a'+'v');
//        System.out.println('j'+0);
//        System.out.println('a'+0);
//        System.out.println('v'+0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i <= (2^n-1); i+=2)
            sum = sum + i*i;

        System.out.println("Sum of the series is: "+sum);

    }
}
