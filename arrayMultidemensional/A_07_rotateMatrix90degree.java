package arrayMultidemensional;
import java.util.Scanner;
public class A_07_rotateMatrix90degree {
    static void rotateAmatrix90Degree(int[][] matrix , int n){
        transposeInplace(matrix, n,n);
       
        reverse(matrix);
        
    }
    static void transposeInplace(int[][] matrix,int r,int c){
            for(int i = 0; i<c;i++){
            for(int j = i+1; j<r;j++){
             int temp = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = temp;
            }
        }
    }
    static void reverse (int[][] matrix){
        for(int i = 0; i<matrix.length;i++){
            int left = 0;
            int right = matrix[i].length-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left]= matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
static void printArray(int[][] matrix){
        for(int i = 0; i<matrix.length;i++){
        for(int j = 0; j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+ " ");
        
            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter matrics no. of Row and no. of col");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("enter " +r*c+" element of matrix:");
        for(int i = 0; i<r;i++){
            for(int j = 0; j<c;j++){
            matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix");
        printArray(matrix);

        System.out.println("after rotating matrix 90 degree");
        rotateAmatrix90Degree(matrix, r);
        printArray(matrix);
    }
    
}
