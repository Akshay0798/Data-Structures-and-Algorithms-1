public class FunctionOverloading {
    public static void main(String[] args) {
        fun(87);
        fun("My Suppu");


    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String Name){
        System.out.println(Name);
    }



}
