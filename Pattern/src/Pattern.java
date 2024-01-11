public class Pattern {
    public static void main(String[] args) {
        printHollowRectangle(5, 5);
        printLeftTriangle(4);
        printRightTriangle(4);
        printLeftAlignedTriangle(5);
        printNumberTriangle1(5);
        printNumberTriangle2(5);
        printFloydsTriangle(5);
        printButterflyPattern(4);
        printPatternWithSpaces(5);
        printNumberPyramid(5);
        printPalindromePattern(5);
        printDiamondPattern(4);
    }
    
    // Method to print a hollow rectangle of stars
    public static void printHollowRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    // Method to print left-aligned triangle of stars
    public static void printLeftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method to print right-aligned triangle of stars
    public static void printRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method to print left-aligned triangle of stars with spaces
    public static void printLeftAlignedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method to print a number triangle in increasing order
    public static void printNumberTriangle1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    // Method to print a number triangle in decreasing order
    public static void printNumberTriangle2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    // Method to print Floyd's Triangle
    public static void printFloydsTriangle(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    
    // Method to print a Butterfly pattern
    public static void printButterflyPattern(int n) {
        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int L = 1; L <= i; L++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int L = 1; L <= i; L++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method to print a pattern with spaces
    public static void printPatternWithSpaces(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method to print Number Pyramid
    public static void printNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    // Method to print a Palindrome pattern
    public static void printPalindromePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    // Method to print a Diamond pattern
    public static void printDiamondPattern(int n) {
        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
