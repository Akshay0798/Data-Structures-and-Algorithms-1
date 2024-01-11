//string -baccadba ; Ans -bccdb
public class RemovesChar {
    public static void main(String[] args) {
        skip(" ","baccarat");
        //System.out.println(skip("abcdba"));
        //System.out.println(SkipApple("AkshayOtherSuppu"));
    }

    static void skip(String neww, String original) {
        if (original.isEmpty()) {
            System.out.println(neww);
            return;
        }
        char ch = original.charAt(0);
        if (ch == 'a') {
            skip(neww, original.substring(1));
        } else {
            skip(neww + ch, original.substring(1));
        }
    }

    //    ----------------------------------------------------------------------
    static String skip(String str) {
        if (str.isEmpty()) {
            return " ";
        }
        char ch = str.charAt(0);
        if (ch == 'b') {
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }
    }

    //    ----------------------------------------------------------------------------
    static String SkipApple(String string) {
        if (string.isEmpty()) {
            return " ";
        }
        if (string.startsWith("Other")) {
            return SkipApple(string.substring(5));
        } else {
            return string.charAt(0) + SkipApple(string.substring(1));
        }
    }
}


