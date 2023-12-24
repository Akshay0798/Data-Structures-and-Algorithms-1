import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb1 = new StringBuffer();
        //constructor 2
        StringBuffer sb2 = new StringBuffer("Akshay Umredkar");
        //constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb1.append("Akshu Love");
        sb1.append(" Suppu Darling");
        sb1.insert(24," So Much !");

        sb1.replace(0,6," Akshay ");
        sb1.delete(0,6);
        sb1.reverse();

        String str = sb1.toString();
        System.out.println(str);
        System.out.println(sb3.capacity());
        System.out.println();
//--------------------------------------------------------------------------------------
        //remove whitespace
        String sentence = "Hi M y Na  me i s Ak s  h a   y" ;
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s" ,""));

        //split
        String arr = "Kunal,Apoorv,Rahul,Suppu";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("00000.0000000");
        System.out.println(df.format(7.29));
    }
}






