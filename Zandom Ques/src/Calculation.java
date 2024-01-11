import java.util.Scanner;
import java.util.TreeSet;

public class Calculation {
//    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
//        int n=1324;
//        System.out.println(n%10);
//        System.out.println(n/10);
//    }
//}


    public static TreeSet<String> st = new TreeSet<>();

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        permute(str, "");
        int count = 0;
        for (String s : st) {
            count++;
            //System.out.print(count+" "+s+"\n");
            if (s.equals(str)) {
                System.out.print(count);
            }
        }
    }

    static void permute(String str, String res) {
        if (str.length() == 0) {
            st.add(res);
            return;
        }
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String pre = left + right;
            permute(pre, res + ch);
        }
    }
}