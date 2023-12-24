import java.util.ArrayList;
import java.util.Scanner;

public class mainEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //syntax
        ArrayList<String> fruits = new ArrayList<>(0); //list reference variable
        ArrayList<Integer> list = new ArrayList<>(0); //list reference variable


    /*
         list.add(67);
         list.add(68);
         list.add(69);
         list.add(672);
         list.add(678);
         System.out.println(list);
         System.out.println(list.contains(69)); //if its available then give (True)/else(False)
         System.out.println(list.set(0,99)); //0 is index,99 is element
         System.out.println(list);
         System.out.println(list.remove(2));
    */


        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here
        }
        System.out.println(list);



    /*
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("mango");

        System.out.println("Before set: " + fruits);

        fruits.set(2, "Grapes"); // Replace an element at index 2 with "Grapes"

        System.out.println("After set: " + fruits);
    */
    }
}
