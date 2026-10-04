package arrayMultidemensional;
import java.util.Scanner;
public class A_03_Addition {
    static void add(int[][] a , int r1, int c1 , int[][] b , int r2 , int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("wrong we cannot add these matrics");
         return ;
        }
        int [][] sum = new int[r1][c1];
        for(int i = 0 ; i<r1;i++ ){
            for(int j = 0; j<c1 ;j++){
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        printArray(sum);
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
        System.out.println("enter no. of rows for matrices1");
        int r1 = sc.nextInt();
        System.out.println("enter no. of columns");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter "+r1*c1 +" matrics values");
        for(int i = 0;i<r1;i++){
            for(int j = 0; j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter no. of rows for matrices 2");
        int r2 = sc.nextInt();
        System.out.println("enter no. of columns");
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
        add(a, r1, c1, b, r2, c2);
    }
    
}

    

