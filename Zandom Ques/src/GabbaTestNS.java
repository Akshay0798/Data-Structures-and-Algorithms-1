import java.util.Scanner;

//    Problem Statement
//    Australia hasn’t lost a Test Match at the Gabby since 1988. India has to win this one, but unfortunately, all of their players are injured.
//
//    You are given the following information:
//            1. A total of N players is available, all are injured initially.
//            2. You have M magic pills. Using X pills, you can make any one player fit for a match.
//            3. Alternatively, you can exchange any player for Y magic pills.
//
//    Compute the maximum number of players you can make fit for the Gabby Test Match.
//
//    Note: "Exchanging" a player means that player will no longer be available, and you will gain Y extra magic pills for the exchange
//    Input:
//    The input contains a single line containing 4 integers N M X Y.
//    Output:
//    The output should contain a single integer representing the maximum number of players you can make fit before the match.
public class GabbaTestNS {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextInt();
        long n=sc.nextInt();
        long x=sc.nextInt();
        long y=sc.nextInt();

        if(m/x >= n){
            System.out.println(n);
        }else{
            long count =m/x;
            m=m  % x;
            n=n-count;
            if (((n-1) * y+m) <x)
                System.out.println(count);
            else
                System.out.print(count + n-countSacrifice(1,n,m,x,y));
        }

    }
    public static long countSacrifice(long min,long max,long m,long x,long y){
        long n=max;
        while(min < max){
            long mid =min+(max-min)/2;

            if((mid * y+m) >= (n-mid)*x){
                max=mid;
            } else{
                min=mid+1;
            }
        }
        return min;
    }
}

