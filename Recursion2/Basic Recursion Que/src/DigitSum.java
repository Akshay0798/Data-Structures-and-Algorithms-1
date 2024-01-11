public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(123456));

    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        int ans1 = (n % 10);
        int ans2 = sum(n / 10);
        return ans1 + ans2;
    }
}
