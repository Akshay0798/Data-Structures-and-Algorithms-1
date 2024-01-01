import java.math.BigDecimal;

public class BigDecimalEx {
    public static void main(String[] args) {
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        double ans = y - x;
        //System.out.println("Double calculation: " + ans);

        BigDecimal m = new BigDecimal("0.03");
        BigDecimal n = new BigDecimal("0.04");
        BigDecimal ans2 = n.subtract(m);
        //System.out.println("BigDecimal calculation: " + ans2);

        BigDecimal a = new BigDecimal("456576345675.4546376");
        BigDecimal b = new BigDecimal("547634565352.986785764");

        // operations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());
    }
}

//float and double is floating point number

