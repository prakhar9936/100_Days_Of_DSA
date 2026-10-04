package arrayMultidemensional;

public class A_01_initializationOf2D {
    static void print2DArray(int[][] arr){
        for(int i = 0 ;i<arr.length ;i++ ){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[][] arr2 = {
            {1,2,3},
            {7,8,9,0},
            {4,5,6}
        };
        print2DArray(arr2);
        
    }
    
}
