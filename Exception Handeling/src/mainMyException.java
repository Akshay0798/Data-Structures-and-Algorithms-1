public class mainMyException {
    public static void main(String[] args) {

        try{
            String name="Akshay";
            if (name.equals("Akshay")){
                throw new MyException("My name is Suppu");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

    }

}
