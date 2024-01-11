import java.util.ArrayList;

public class CombinationPhoneNo {
    public static void main(String[] args) {
        PhoneNo("", "12");
        System.out.println(PhoneNumReturn("","12"));
        System.out.println(PhoneNoCount("","12"));
    }

    static void PhoneNo(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';//this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            PhoneNo(p + ch, up.substring(1));
        }
    }
//----------------------------------------------------------------------------------------------------
    static ArrayList<String> PhoneNumReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';//this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>(); //whatever answer there u put it in a list

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(PhoneNumReturn(p + ch, up.substring(1)));
        }

        return list;
    }
//----------------------------------------------------------------------------------------------------
    static int PhoneNoCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int digit = up.charAt(0) - '0'; //this will convert '2' into 2

        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + PhoneNoCount(p + ch, up.substring(1));
        }
        return count;
    }
}
