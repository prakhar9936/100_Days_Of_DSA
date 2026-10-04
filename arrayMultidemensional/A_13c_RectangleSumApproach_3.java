package arrayMultidemensional;
import java.util.Scanner;
public class A_13c_RectangleSumApproach_3 {
        // First calculate row-wise prefix sum,
    // then calculate column-wise prefix sum
    // to create a 2D prefix sum matrix.

    static void prefixSumOfMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        
        // traverse each row to calculate row-wise prefix sum
     for(int i = 0 ; i<r;i++){
        for(int j = 1 ; j< c;j++){
            matrix[i][j] = matrix[i][j-1] + matrix[i][j];
        }
     }
     //traverse vertically to calculate column wise sum of In this row wise prefixsum
     for(int j = 0; j<c;j++){
        for(int i = 1; i<r;i++){
            matrix[i][j] += matrix[i-1][j];
        }
        // this is matrix represent : -- matrix[i][j] = sumRectangle ((0,0),(i,j))
     }
        
    }
    static int findSum(int[][] matrix , int l1, int r1, int l2,int r2){
        int ans = 0, sum = 0,up = 0 ,left = 0, leftUp=0;
        prefixSumOfMatrix(matrix);
        sum = matrix[l2][r2];
        if(l1>=1){
        up = matrix[l1-1][r2];
        }
        if(r1>=1){
        left = matrix[l2][r1-1];
        }
        if(l1>=1 && r1>=1){
        leftUp = matrix[l1-1][r1-1];
        }

        ans = sum - up - left + leftUp;
        return ans;
        

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + r * c + " elements of matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, r1, l2, r2:");

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

       System.out.println("Rectangle sum: "+ findSum(matrix, l1, r1, l2, r2));
    }
    
}

    

