public class Shadowing {
    static int x=90;  //this will be showing the line 6
    public static void main(String[] args) {
        System.out.println(x);
        int x=80;
        System.out.println(x);

        bike();
    }
    static void bike (){
        System.out.println(x);
    }
}
