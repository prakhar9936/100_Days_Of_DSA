package sortingAndSearching;

public class Leetcode_01_SearchA2Dmatrix {
    static boolean SearchMatrix(int [][] matrix ,int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int st = 0;
        int end = m*n-1;
        while(st<=end){
           int mid = st+(end - st)/2;
           int mid_Element = matrix[mid/n][mid%n]; // for return mid element 
            if(mid_Element == target){
                return true;
            }else if(target>mid_Element){
                st = mid+1;
            }else {
                //target<mid_elemnt
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix ={
                        {1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60} 
                         };
    
                        System.out.println(SearchMatrix(matrix, 16));
                        System.out.println(SearchMatrix(matrix, 3));
                        System.out.println(SearchMatrix(matrix, 8));
}
}
