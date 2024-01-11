import java.util.Scanner;

public class revVovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(revWow(s));

    }
    public static boolean isVow(char c){

        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){

                return true;

            }

            return false;

        }

        public static String revWow(String s){

            char ar[] = s.toCharArray();

            int i= 0;

            int j=s.length()-1;

            while(i<=j){

                while(i<=j && isVow(ar[i])==false){

                    i++;

                }

                while(i<=j && isVow(ar[j])==false){

                    j--;

                }

                if(i<=j){

                    char t = ar[i];

                    ar[i] = ar[j];

                    ar[j]= t;

                }

                i++;

                j--;

            }

            return new String(ar);
        }
    }

