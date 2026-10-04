package arrayMultidemensional;
import java.util.*;;
public class A_06_TransportOfMatrix {

static int[][] transpose(int[][] arr,int r , int c){
    int [][] trans = new int[c][r];
    for(int i = 0 ;i < c ;i++){
        for(int j = 0; j<r ;j++){
        trans[i][j] = arr[j][i];
        }
    }
    return trans;

}
//inplace transpose
static void transposeInplace(int[][] matrix , int r , int c){
    for(int i = 0; i< c; i++){
        for(int j = i ;j<r;j++ ){
              int temp = matrix[i][j];
    matrix[i][j] = matrix[j][i];
    matrix[j][i] = temp;

        }
    }
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
        System.out.println("enter array");
        System.out.println("enter no. of rows1 ");
        int r1 = sc.nextInt();
        System.out.println("enter no. of columns1");
        int c1 = sc.nextInt();
        int[][] matrix = new int[r1][c1];
        System.out.println("enter "+r1*c1 +" matrics values");
        for(int i = 0;i<r1;i++){
            for(int j = 0; j<c1;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
     
        System.out.println("original array:");
        printArray(matrix);
        System.out.println("transport matrix");
   int [][] ans = transpose(matrix, r1, c1);
    printArray(ans);

    System.out.println("trnspose matrix using inplace..");
    transposeInplace(matrix, r1, c1);
    printArray(matrix);
    
        
    }
    
}

    


    




