public class Palidrom {
    public static void main(String[] args) {
        int num=121;
        String str ="Akshay";
        System.out.println(check_Palindrome(str,0, str.length()-1));
    }
    static boolean check_Palindrome(String str,int s, int e)
    {
        if(s>=e){
            return true;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }


        return check_Palindrome(str,s+1,e-1);

    }
}
