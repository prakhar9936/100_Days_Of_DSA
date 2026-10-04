package arrayMultidemensional;
import java.util.*;
public class A_04_multiplication {

    static void multiplication(int[][] a , int r1, int c1 , int[][] b , int r2 , int c2){
        if(c1 != r2){
            System.out.println("MULTIPLICATION IS NOT POSSIBLE");

         return ;
        }
        int [][] mux = new int[r1][c2];
        for(int i = 0 ; i<r1;i++ ){
            for(int j = 0; j<c2 ;j++){
                for(int k = 0 ; k<c1;k++){//for operation
                mux[i][j] =(a[i][k]+b[k][j]);
                }
            }
        }
        System.out.println("multiplication of 2 matrices");
        printArray(mux);
    } 

        static void printArray(int[][] arr){
        for(int i = 0 ;i<arr.length ;i++ ){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MATRICES ONE");
        System.out.println("enter no. of rows1 ");
        int r1 = sc.nextInt();
        System.out.println("enter no. of columns1");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter "+r1*c1 +" matrics values");
        for(int i = 0;i<r1;i++){
            for(int j = 0; j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRICES TWO");
        System.out.println("enter no. of rows2 "+c1+"same as c1 ");
        int r2 = sc.nextInt();
        System.out.println("enter no. of columns2");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("enter "+r2*c2 +" matrics values");
        for(int i = 0;i<r2;i++){
            for(int j = 0; j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrices 1");
        printArray(a);
        System.out.println("martrices 2");
        printArray(b);
        System.out.println("new matrics sum of these two matrics are:");
        multiplication(a, r1, c1, b, r2, c2);
    }
    
}

    


    

