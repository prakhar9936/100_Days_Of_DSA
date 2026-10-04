package sortingAndSearching;

import loops.l10_nestedloop;

public class Leetcode_02_Search2DMatixII {
    static boolean searchMatrix(int[][] a,int target){
        int m = a.length;
        int n = a[0].length;
        int i = 0;
        int j = n-1;
        while(i<n && j>=0){
            if(a[i][j] == target) return true;
            else if(a[i][j]<target) i++;
            else j--;
        }
        return false;
    }
public static void main(String[] args) {
    int[][] matrix = {
        {1,4,7,11,15},
        {2,5,8,12,19},
        {3,6,9,16,22},
        {10,13,14,17,24},
        {18,21,23,26,30}
          };
System.out.println(searchMatrix(matrix, 20));
System.out.println(searchMatrix(matrix, 6));
System.out.println(searchMatrix(matrix, 14));
}    
}
