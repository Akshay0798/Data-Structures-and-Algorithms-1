//Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/
/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
the i th customer has in the j bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
Example 1:

        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest with wealth of 6 each, so return 6.
*/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 5, 1}};
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        //person = row
        //account = col

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {

            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            // now we have sum of accounts of person
            // check/compare with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
