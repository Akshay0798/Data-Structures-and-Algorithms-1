import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(DiceRet("", 4));
        diceFaceMore("",2,8);

    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

//------------------------------------------------------------------------------------------------
    static ArrayList<String> DiceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>(); //whatever answer there u put it in a list

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(DiceRet(p + i, target - i));
        }
        return list;
    }

//-----------------------------------------------------------------------------------------------

    //what if we have more faces
    static void diceFaceMore(String p, int target,int Faces) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= Faces && i <= target; i++) {
            diceFaceMore(p + i, target - i,Faces);
        }
    }
}
