public class prime_optimise_sieve {
    public static void main(String[] args) {
        int n=40; //its index value
        boolean[] primes=new boolean[n+1];
        sieve(n,primes);
    }

    //false in array means number is prime,
    //so whatever is true is not prime
    //initially all the boolean array no. is false
    static void sieve(int n,boolean[] primes){
        for (int i = 2; i*i <=n ; i++) {
            if (!primes[i]){  //if prime is not equal to false
                for (int j = i*2 ; j <=n ; j+=i) { //2*i --> bcoz its multiple, if 2 is prime his multiple not
                    primes[j]= true; //we make all the multiple number is true (true means not prime)
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if (!primes[i]){
                System.out.print(i +" ");
            }
        }
    }
}
//space complexity:O(n)
//time complexity: O(N *log(log n))
