public class NumberExampleRecurtive {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        if (n==5){
            System.out.println(n);
            return;
        }
        //if u callin a function again and again u can treat it as a seperate call in the stack
        System.out.println(n);
        print(n+1);
    }
}
