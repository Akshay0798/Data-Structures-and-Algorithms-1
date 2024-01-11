import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        Subsequences(" ","abc");
        System.out.println();
        System.out.println(Subseq("","abc"));
    }
    static void Subsequences(String process,String unprocess) {
        if (unprocess.isEmpty()) {
            System.out.print(process + " ");
            return;
        }
        char ch = unprocess.charAt(0);
        Subsequences(process + ch, unprocess.substring(1)); //add it
        Subsequences(process, unprocess.substring(1)); //ignore it
    }
//    ----------------------------------------------------------------------------------------
    static ArrayList<String> Subseq(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = Subseq(p +ch,up.substring(1));
        ArrayList<String> right = Subseq(p ,up.substring(1));

        left.addAll(right);
        return left;
    }
}
