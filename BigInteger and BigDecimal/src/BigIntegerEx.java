import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        BI(); // Call your method
    }

    static void BI() {
        int a = 30;
        int b = 67;

        java.math.BigInteger B = java.math.BigInteger.valueOf(6); // convert int/long to BI
        int c = B.intValue(); // convert BI to int
        java.math.BigInteger C = new java.math.BigInteger("2345678654325678976543256789");
        java.math.BigInteger X = new java.math.BigInteger("4536789765640795374656347852");

        // constants
        java.math.BigInteger D = java.math.BigInteger.TEN;
        java.math.BigInteger multiplied = C.multiply(D);
        System.out.println("Multiplied by TEN: " + multiplied);


        // operations
        java.math.BigInteger sum = C.add(X);
        java.math.BigInteger mul = C.multiply(X);
        java.math.BigInteger sub = C.subtract(X);
        java.math.BigInteger div = C.divide(X);
        java.math.BigInteger rem = C.remainder(X);
        System.out.println(mul);


        if (C.compareTo(X) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(fact(143));
    }

    static java.math.BigInteger fact(int n) {
        java.math.BigInteger result = java.math.BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(java.math.BigInteger.valueOf(i));
        }
        return result;
    }
}
