public class AlphabetPerformance {
    public static void main(String[] args) {
        // Part 1: Concatenating characters using String
        String concatenatedAlphabet = "";
        for (int i = 0; i < 26; i++) {
            char currentChar = (char) ('a' + i);
            concatenatedAlphabet = concatenatedAlphabet + currentChar;
        }
        System.out.println("Concatenated Alphabet using String: " + concatenatedAlphabet);

        // Part 2: Building a string using StringBuilder - mutable.
        // it can modify the same object without creating new ones in each iteration.
        // This results in better performance compared to string concatenation
        StringBuilder stringBuilderAlphabet = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char currentChar = (char) ('a' + i);
            stringBuilderAlphabet.append(currentChar);
        }
        System.out.println("Alphabet using StringBuilder: " + stringBuilderAlphabet.toString());

        // Part 3: Reversing the StringBuilder
        stringBuilderAlphabet.reverse();
        System.out.println("Reversed Alphabet: " + stringBuilderAlphabet);
    }
}
