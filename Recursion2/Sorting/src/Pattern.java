public class Pattern {
    public static void main(String[] args) {
        Reverse_trinagle(4,0);
        Trinagle(4,0);

    }
    static void Reverse_trinagle(int row, int column){
        if(row==0){
            return;
        }
        if (column < row){
            System.out.print("* ");
            Reverse_trinagle(row,column+1);
        }else {
            System.out.println();
            Reverse_trinagle(row-1,0); //0 bcoz after new line column start from zero
        }
    }
    static void Trinagle(int row, int column){
        if(row==0){
            return;
        }
        if (column < row){
            Trinagle(row,column+1);
            System.out.print("* ");

        }else {
            Trinagle(row-1,0); //0 bcoz after new line column start from zero
            System.out.println();
        }
    }

}