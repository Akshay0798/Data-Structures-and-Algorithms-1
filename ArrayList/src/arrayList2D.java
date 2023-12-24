import java.util.ArrayList;
import java.util.Scanner;
public class arrayList2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> suppu = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3; i++) {
            suppu.add(new ArrayList<>());

        }
        System.out.println(suppu);

        //add a element
        for (int j = 0; j < 3 ; j++) {
            for (int k = 0; k < 3; k++) {
                suppu.get(j).add(sc.nextInt());

            }
        }
        System.out.println(suppu);

    }

}
