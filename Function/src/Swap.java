public class Swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        int swap=a;
//        a=b;
//        b=swap;
//        System.out.println(a + " " + b);
//__________________________________________________________________
//        swapp(a, b);
//        System.out.println(a + " " + b);
//    }
//        static void swapp(int a, int b){
//            int temp=a;
//            a=b;
//            b=temp;
//        }

        //its not working...its not work like that

//_______________________________________________________________________

        //passing example
        //no pass by refrence in java only value psss

        String name="Akshay Umredkar"; //Akshay Umredkar is a value ...and in java only value pass not refrence
        greet(name);
    }

        static void greet(String naam) { //so in naam only value is passing internally..
                                            // so both variable pointing toward same value
            System.out.println(naam);
//____________________________________________________________________________________________________________


    }
}