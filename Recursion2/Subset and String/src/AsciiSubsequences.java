import java.util.ArrayList;

public class AsciiSubsequences {
    public static void main(String[] args) {
        //AsciiSubseq("","ab");
        System.out.println(AsciiSubseqReturn("","SA"));
    }
    static void AsciiSubseq(String process,String unprocess) {
        if (unprocess.isEmpty()) {
            System.out.print(process + " ");
            return;
        }
        char ch = unprocess.charAt(0);
        AsciiSubseq(process + ch, unprocess.substring(1));
        AsciiSubseq(process, unprocess.substring(1));
        AsciiSubseq(process + (ch + 0),unprocess.substring(1));
    }
//    ------------------------------------------------------------------------------------
    static ArrayList<String> AsciiSubseqReturn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch=up.charAt(0);
        ArrayList<String> first = AsciiSubseqReturn(p +ch,up.substring(1));
        ArrayList<String> second = AsciiSubseqReturn(p ,up.substring(1));
        ArrayList<String> third = AsciiSubseqReturn(p + (ch + 0) ,up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}


