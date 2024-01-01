public class Main {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            System.out.println(divide(5,0));
        }
        catch(Exception l){  //we can write as ArithmeticException also (it will show only arithmetic exception)
            System.out.println("ArithmeticException found");
            System.out.println(l.getMessage());
        }
        finally {
            System.out.println("finally keyword will always execute");
        }

    }
    static int divide(int a,int b){
        if (b==0){
            throw new ArithmeticException("please do not divide by zero"); //this will not return anything
        }
        return a/b;
    }
}