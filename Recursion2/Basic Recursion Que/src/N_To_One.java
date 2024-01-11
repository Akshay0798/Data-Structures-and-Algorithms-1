public class N_To_One {
    public static void main(String[] args) {
       num(5);
       numReverse(5);
        fun(5);
    }

    static void numReverse(int n){
        if(n==0){
            return ;
            }
            numReverse(n-1);
            System.out.print(n + " ");
    }
    static void num(int n){
        if(n==0){
            return ;
        }
            System.out.print(n + " ");
            num(n-1);
    }
    static void fun(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(--n); //subtract then pass

    }
}
