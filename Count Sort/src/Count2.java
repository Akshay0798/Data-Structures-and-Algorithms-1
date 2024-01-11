import java.util.Arrays;

class Count2 {
        // count sort
        public static void countSort(int[] arr){
            int[] result = new int[arr.length + 1];
            // finding maximum element
            int max = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++)
                max = Math.max(max, arr[i]);
            // count array initialize
            int[] count = new int[max+1];
            for(int i=0; i<count.length; i++)
                count[i] = 0;
            // count of elements from source array
            for(int i=0; i<arr.length; i++)
                count[arr[i]]++;
            // cumulative sum
            for(int i=1; i<count.length; i++)
                count[i] = count[i-1] + count[i];
            // creating sorted array
            // stable
            for(int i=arr.length-1; i>=0; i--){
                result[count[arr[i]] - 1] = arr[i];
                count[arr[i]]--;
            }
            // copy result array to source array
            for(int i=0; i<arr.length; i++)
                arr[i] = result[i];
        }

        public static void main(String[] args) {
            int[] arr = {1, 4, 3, 2, 3, 5, 2};
            System.out.println("Before Sorting: " + Arrays.toString(arr));
            countSort(arr);
            System.out.println("After Sorting: " + Arrays.toString(arr));
        }
    }

