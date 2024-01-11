public class Sorted_Not {
    public static void main(String[] args) {
        int [] arr={85,1,2,4,6,8,9,12};
        System.out.println(Sorted(arr,0));
    }
    //this arr object is 1...we are not changing this we are changing only index
    static boolean Sorted(int [] arr,int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && Sorted(arr,index+1);
    }
}