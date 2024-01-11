public class Recursion3 {
    
    static int first = -1;
    static int last = -1;
    
    public static void main(String[] args) {
        // Test findOccurrence method
        String str = "asgydbuhdibdjhgsl";
        findOccurrence(str, 0, 's');
        
        // Test printKeypadCombination method
        String number = "19";
        printKeypadCombination(number, 0, "");
    }
    
    public static void findOccurrence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurrence(str, index + 1, element);
    }
    
    public static void printKeypadCombination(String number, int idx, String res) {
        if (idx == number.length()) {
            System.out.print(res + " ");
            return;
        }
        
        String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        
        for (int i = 0; i < keypad[number.charAt(idx) - '0'].length(); i++) {
            char curr = keypad[number.charAt(idx) - '0'].charAt(i);
            printKeypadCombination(number, idx + 1, res + curr);
        }
    }
}
