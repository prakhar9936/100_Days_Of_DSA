package arrayMultidemensional;

import java.sql.Savepoint;
import java.util.Scanner;

public class A_08_pascalTriangle {
    static int[][] pascal(int n){
        int [][] ans = new int[n][];
        for(int i = 0; i<n;i++){
            // this is for i+1 col.
            ans[i] = new int[i+1];
            // first and last element with same element as 1
             ans[i][0]=ans[i][i] = 1;
             //for middle elements
            for(int j = 1 ; j<i;j++){
                ans[i][j]=ans[i-1][j] +ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void printMatrix(int[][] matrix){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0 ;j< matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);
    }
    
}
