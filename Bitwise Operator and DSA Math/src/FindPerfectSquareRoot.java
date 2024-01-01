public class FindPerfectSquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; // Precision value

        System.out.println(sqrt(n, p));
        System.out.printf("%.3f", sqrt(n, p));
    }

    // Function to calculate square root with precision
    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;

        // Binary search to find integer part of the square root
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                root = mid;
                return mid;
            }

            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // For precision value
        double increment = 0.1; // (1/10, 1/100)
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root = root + increment;
            }
            root -= increment;
            increment /= 10;
        }

        return root;
    }
}
