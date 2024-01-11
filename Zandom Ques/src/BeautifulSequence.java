import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        String T = scanner.next();

        // Finding S
        String S = findS(T);

        // Printing the result
        System.out.println(S);

        scanner.close();
    }

    public static String findS(String T) {
        StringBuilder S = new StringBuilder();
        StringBuilder SPrime = new StringBuilder();
        Set<Character> setSPrime = new HashSet<>();

        // Building SPrime by removing 'a' characters from T
        for (char ch : T.toCharArray()) {
            if (ch != 'a') {
                SPrime.append(ch);
                setSPrime.add(ch);
            }
        }

        // Building S by adding characters from T that are not in both SPrime and S
        for (char ch : T.toCharArray()) {
            if (!setSPrime.contains(ch) || ch == 'a') {
                S.append(ch);
            }
        }

        // Check if a valid string S exists
        if (S.length() * 2 != T.length() || !T.equals(S.toString() + SPrime.toString())) {
            return ":(";
        }

        return S.toString();
    }
}
