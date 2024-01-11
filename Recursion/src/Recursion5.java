import java.util.ArrayList;

public class Recursion5 {
    public static void main(String[] args) {
        int n = 3;
        findSubsets(n, new ArrayList<Integer>());
    }
    
    public static void printSubsets(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubsets(subset);
            return;
        }
        
        findSubsets(n - 1, subset);
        subset.add(n);
        findSubsets(n - 1, subset);
        subset.remove(subset.size() - 1);
    }
}
//TC: O(2^n) - where 'n' is the number of elements. It generates all possible subsets.
//SC: O(n) - space for recursive stack and additional space for the list 'subset'.
