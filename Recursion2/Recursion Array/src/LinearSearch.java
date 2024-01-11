public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,54,7,4,3,44,32,2,5};
        int target=44;
        System.out.println(Linear(arr,target,0));
    }

    static int Linear ( int[] arr, int target, int index){
            if (index == arr.length) {
                return -1;
            }
            if (arr[index] == target) {
                return index;
            } else
                return Linear(arr, target, index + 1);
        }
    }

