import java.util.ArrayList;

public class Recursion4 {
    
    public static void main(String[] args) {
        // Find permutation of a string
        // TC=O(n*n!)
        String str = "abc";
        printPermutation(str, 0, "");
        
        // Count path Maze
        // TC=O(2^(m+n))
        int m1 = 3, n1 = 3;
        System.out.println(countPaths(0, 0, m1, n1));
        
        // Tiling problem
        int x = 4, y = 2;
        System.out.println(placeTiles(x, y));
        
        // Friends pairing problem
        // Find the number of ways in which you can invite n people to your party, single or in pairs
        int n2 = 2;
        System.out.println(pairFriends(n2));
        
        
    }
    
    public static void printPermutation(String str, int idx, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, idx + 1, perm + currChar);
        }
    }
    
    public static int countPaths(int i, int j, int m, int n) {
        if (i == m - 1 || j == n - 1) {
            return 1;
        }
        return countPaths(i + 1, j, m, n) + countPaths(i, j + 1, m, n);
    }
    
    public static int placeTiles(int n, int m) {
        if (n < m) {
            return 1;
        } else if (n == m) {
            return 2;
        }
        return placeTiles(n - 1, m) + placeTiles(n - m, m);
    }
    
    public static int pairFriends(int n) {
        if (n <= 1) {
            return 1;
        }
        int Oneway = pairFriends(n - 1);
        int TwoWay = (n - 1) * pairFriends(n - 2);
        return Oneway + TwoWay;
    }
}

/*Time Complexity (TC) and Space Complexity (SC) analysis:*/
/*
printPermutation:
TC: O(n * n!) - where 'n' is the length of the string. It generates all permutations of the string.
SC: O(n) - space for recursive stack and additional space for the string 'perm'.

countPaths:
TC: O(2^(m+n)) - where 'm' and 'n' are the dimensions of the maze. It explores all possible paths.
SC: O(m + n) - space for recursive stack.

placeTiles:
TC: It's hard to precisely determine the TC, but it's related to the number of recursive calls generated. The TC depends on the input 'n' and 'm'.
SC: O(n) - space for recursive stack.

pairFriends:
TC: O(2^n) - where 'n' is the number of friends. It explores all possibilities of pairing.
SC: O(n) - space for recursive stack.

*/