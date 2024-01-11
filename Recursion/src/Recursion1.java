public class Recursion1 {
    public static void main(String[] args) {
        // Print numbers from 5 to 1 using recursion
        int n = 5;
        printNumber(n);
        
        // Print numbers from 1 to 5 using recursion
        n = 1;
        printNumber(n);
        
        // Print the sum of n natural numbers using recursion
        printSum(1, 5, 0);
        
        // Calculate factorial of n number using recursion
        n = 5;
        System.out.println(calFactorial(n));
        
        // Print Fibonacci series using recursion
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int fiboCount = 7;
        calculateFibonacci(a, b, fiboCount - 2); // Minus 2 because 2 numbers are already printed (a & b)
        
        // Calculate x raised to the power n using recursion
        int x = 2, power = 5;
        int result = calculatePower(x, power);
        System.out.println(result);
        
        // Calculate x raised to the power n using logarithmic time complexity
        x = 9;
        int nPower = 5;
        int output = calculatePowerLogarithmic(x, nPower);
        System.out.println(output);
    }
    
    static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }
    
    static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i);
    }
    
    static int calFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calFactorial(n - 1);
    }
    
    static void calculateFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        calculateFibonacci(b, c, n - 1);
    }
    
    static int calculatePower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return x * calculatePower(x, n - 1);
    }
    
    static int calculatePowerLogarithmic(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int result = calculatePowerLogarithmic(x, n / 2);
            return result * result;
        } else {
            int result = calculatePowerLogarithmic(x, n / 2);
            return x * result * result;
        }
    }
}
