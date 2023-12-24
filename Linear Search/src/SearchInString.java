public class SearchInString {
    public static void main(String[] args) {
        String name = "Suppu";
        char target = 'p';
        System.out.println(search(name , target)); //first one


    }

    static boolean search(String str, char target) {
        if (str.length() == 0) { //str.length()--its a function or method
            return false;

        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}




