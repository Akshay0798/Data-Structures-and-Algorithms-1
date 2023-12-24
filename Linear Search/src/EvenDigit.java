//Q:Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class EvenDigit {
    public static void main(String[] args) {
        int[] Number={12,345,2,6,-7896,1234};
        System.out.println(findNumbers(Number));

        //If I have to find how many digits of number
        //System.out.println(digit(0));
    }
    static int findNumbers(int[] Number) {
        int count = 0;

//        for (int i = 0; i < Number.length; i++) {
//            int element = Number[i];
//            if (even(element)) {
//                count++;

        for (int element : Number) {
            if (even(element)) {
                count++;
            }
        }
        return count;
    }
    //function to check whether its even or odd
    static boolean even(int element){
        int numberofDigits = digit(element);

/*
        if (numberofDigits % 2 ==0){
            return true;
        }
        return false;
*/

        return numberofDigits % 2 == 0;
    }

    //count a number of digits in a number
    static int digit(int element){
        int count = 0;

        //It's for negative number
        if(element<0){
            element=element*-1;
        }

        //if number is zero
        if (element==0){
            return 1;
        }

        while(element>0){
            count++;
            element= element/10;
        }

        return count;
    }

    //Another way to count the number of digits
//    static int digit2(int element){
//
//        if(element<0){
//            element=element * -1;
//        }
//        if (element==0){
//            return 1;
//        }
//        return (int)(Math.log10(element))+1;
//    }
}
