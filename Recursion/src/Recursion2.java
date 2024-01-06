import java.util.HashSet;

public class Recurtion2 {
    public static void main(String[] args) {
        // Tower of Hanoi
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
        
        // Reverse a string
        String str = "abcd";
        printReverse(str, str.length() - 1);
        
        // Check if an array is sorted or not
        int[] arr = {1, 2, 3, 4, 8, 5};
        System.out.println(isSorted(arr, 0));
        
        // Move all 'u' characters to the end of the string
        String strMoveU = "SuppuILoveyousomuch";
        moveAllU(strMoveU, 0, 0, "");
        
        // Remove duplicates from a string
        String strRemoveDup = "abbbccdd";
        removeDuplicates(strRemoveDup, 0, "");
        
        // Print all unique subsequences of a string
        String strSubseq = "abc";
        HashSet<String> allSubsequences = new HashSet<>();
        printUniqueSubsequences(strSubseq, 0, "", allSubsequences);
    }
    
    // Tower of Hanoi
    static void TowerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        TowerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        TowerOfHanoi(n - 1, helper, source, destination);
    }
    
    // Reverse a string
    static void printReverse(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str, index - 1);
    }
    
    // Check if an array is sorted
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }
    
    // Move all 'u' characters to the end of the string
    static void moveAllU(String str, int index, int count, String newStr) {
        if (index == str.length() - 1) {
            for (int i = 0; i < count; i++) {
                newStr += 'u';
            }
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == 'u') {
            count++;
            moveAllU(str, index + 1, count, newStr);
        } else {
            newStr += currentChar;
            moveAllU(str, index + 1, count, newStr);
        }
    }
    
    // Remove duplicates from a string
    static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // Assuming ASCII characters
        boolean[] map = new boolean[128];
        if (!map[currChar]) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }
    
    // Print all unique subsequences of a string
    static void printUniqueSubsequences(String str, int idx, String result, HashSet<String> allSubsequences) {
        if (idx == str.length()) {
            if (allSubsequences.contains(result)) {
                return;
            }
            allSubsequences.add(result);
            System.out.println(result);
            return;
        }
        printUniqueSubsequences(str, idx + 1, result + str.charAt(idx), allSubsequences);
        printUniqueSubsequences(str, idx + 1, result, allSubsequences);
    }
}
