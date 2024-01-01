import java.util.Arrays;
//variable length argument
//its convert into array format
//when there is a collect of int and string length arg...argument only come in last/End
public class Var_Arguments {
    public static void main(String[] args) {

        //fun("hbhh","iji");
        multiple(12,34,"Suppu","Akshay");


    }

    static void multiple(int a,int b, String ...c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
    static void fun(String ...a){
        System.out.println(Arrays.toString(a));

    }
}
