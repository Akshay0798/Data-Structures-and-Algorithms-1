public class countNumber {
    public static void main(String[] args) {
        System.out.println(countNum(1000000000));
    }
    static int countNum(int n){
        return helper(n,0); //why we are using helper function(bcoz we need the pass's the value in recurtion call)
    }
    //how to pass the value in above call
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n % 10;
        if (rem==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
