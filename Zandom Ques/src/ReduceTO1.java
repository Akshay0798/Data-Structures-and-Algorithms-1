import java.util.Scanner;

public class ReduceTO1 {
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {

        int result = 0;
        while (n != 1)
        {
            if (n % 2 == 0)
            {
                n = n / 2;
            }
            else if (n == 3)
            {
                result = 2;
                break;
            }
            else if ((n & 3) == 1)
            {
                n = n - 1;
            }
            else if ((n & 3) == 3)
            {
                n = n + 1;
            }

            result++;

        }
        return result;
    }
}

