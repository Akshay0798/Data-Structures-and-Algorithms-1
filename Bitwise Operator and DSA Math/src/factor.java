import java.util.ArrayList;

public class factor {
    public static void main(String[] args) {
        factor1(20);
        factor2(20);
        factor3(20);
    }

    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    static void factor2(int n){
        for (int i=1;i<=Math.sqrt(n);i++){
            if (n % i==0){
                if (n/i==i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i +" "+ n/i+" ");
                }
            }
        }
        System.out.println();
    }

    static void factor3(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<=Math.sqrt(n);i++){
            if (n % i==0){
                if (n/i==i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

}
