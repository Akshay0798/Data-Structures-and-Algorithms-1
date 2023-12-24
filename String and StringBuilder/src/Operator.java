import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        // Character addition: 'a' and 'b' are treated as ASCII values and added
        System.out.println('a' + 'b');

        // String concatenation: "a" and "b" are concatenated
        System.out.println("a" + "b");

        // Character and integer addition: 'a' is treated as ASCII, and 0 is added
        System.out.println('a' + 0);

        // Character and integer addition: 'a' is treated as ASCII, and 3 is added
        System.out.println('a' + 3);

        // Character subtraction and casting: 'k' - 3 is calculated and casted to char
        System.out.println((char) ('k' - 3));

        // Integer addition: "a" and 1 are concatenated (1 is converted to String)
        System.out.println("a" + 1);

        // String concatenation with ArrayList: "Akshay" and ArrayList's toString result
        System.out.println("Akshay" + new ArrayList<>());

        // Concatenation with Integer using Integer.toString(): "69" and ArrayList's toString result
        String ans = (Integer.toString(69) + " " + new ArrayList<>());
        System.out.println(ans);

        // Extracting digit from a String: "5" is converted to integer, resulting in 5
        String up = "5";
        int digit = up.charAt(0) - '0';
        System.out.println(digit);
    }
}
