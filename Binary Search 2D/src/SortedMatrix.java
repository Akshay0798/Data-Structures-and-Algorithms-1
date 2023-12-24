import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3,4},
                {4,5,6,7},
                {8,9,10,11},
        };
        int target=2;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    //search between row and col provided.
    static int[] binarySearch(int[][] matrix,int rows,int ColStart,int ColEnd,int target){ //this int row saying in which row you are searching
        while (ColStart <=ColEnd) {
            int mid = ColStart + (ColEnd - ColStart) / 2;
            if (matrix[rows][mid] == target) {
                return new int[]{rows, mid};
            }
            if (matrix[rows][mid]<target){
                ColStart=mid+1;
            }else{
                ColEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[]search(int[][] matrix, int target){
        int row=matrix.length;
        int col=matrix[0].length;

        if (row==1){

            return binarySearch(matrix,0,0,col-1,target );
        }
        int RowStart=0;
        int RowEnd=row-1;
        int MidCol=col/2;
        //run the loop till 2 rows are remaining
        while(RowStart < (RowEnd-1)){
            int mid=RowStart + (RowEnd-RowStart)/2;

            if(matrix[mid][MidCol]== target){
                return new int[]{mid, MidCol};
            }

            if(matrix[mid][MidCol]< target){
                RowStart=mid;
            }else {
                RowEnd =mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 rows
        if(matrix[RowStart][MidCol]== target){
            return new int[]{RowStart,MidCol};
        }
        if(matrix[RowStart + 1][MidCol]==target){
            return new int[]{RowStart +1,MidCol};
        }
        //search in 1st half
        if(target <=matrix[RowStart][MidCol-1]){
            return binarySearch(matrix,RowStart,0,col-1, target);
        }
        //search in 2nd half
        if(target >=matrix[RowStart][MidCol+1] && target <= matrix[RowStart][col-1]){
            return binarySearch(matrix,RowStart,MidCol+1,MidCol-1, target);
        }
        //search in 3rd half
        if(target <=matrix[RowStart +1][MidCol-1]){
            return binarySearch(matrix,RowStart+1,0,MidCol-1, target);
        }else{
            return binarySearch(matrix,RowStart+1,MidCol+1,col-1, target);
        }
    }
}