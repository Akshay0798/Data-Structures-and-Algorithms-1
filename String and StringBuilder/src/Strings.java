public class Strings {
    public static void main(String[] args) {
        String a = new String("Akshay");
        String b = new String("Akshay");
        System.out.println(a == b); //(it's a comparator...comparing a ref variable)

        System.out.println(a.equals(b)); //(its a checking value)

    }
}