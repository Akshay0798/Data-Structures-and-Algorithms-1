public class ReverseNumber {
    public static void main(String[] args) {
//        Reverse1(1234);
//        System.out.println(sum);
        System.out.println(Reverse2(6789));

    }
    static int sum=0;
    static void Reverse1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum = sum * 10 + rem;
        Reverse1(n/10);
    }
//------------------------------------------------------
    static int Reverse2(int n){
        //sometime u need some additional variable in the argument
        //in that make addition function
        int digits=(int)(Math.log10(n)) +1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
}
