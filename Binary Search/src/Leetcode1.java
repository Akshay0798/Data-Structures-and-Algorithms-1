public class Leetcode1 {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    //Find The Smallest Letter Greater Than Target
    public static void main(String[] args) {
        char[] letters = {'a','b','c','d','e','f','g','h','i','j'};
        char target='x';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while (start<=end){
            int mid=start+ (end-start)/2;


            if (target < letters[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }

        return letters[start % letters.length];
    }
}
//Start=end +1 (start to end is distance is consider is one so end +1 is start)
//end=array.length-1
//end=array.length-1+1
//end=array.length
//start=length of array
