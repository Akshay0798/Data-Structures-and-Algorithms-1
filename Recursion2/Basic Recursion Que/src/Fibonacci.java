import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibbonaci(n));

    }
    static int fibbonaci(int n) {
//        base condition....
        if(n == 0) {
            return 0;
        }
        if(n== 1 || n==2) {
            return 1;
        }
//        recursive call
        int ans = fibbonaci(n-1)+fibbonaci(n-2);

        return ans;

    }
}
