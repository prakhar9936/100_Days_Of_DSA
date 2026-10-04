package arrayMultidemensional;
import java.util.*;
public class A_05_reverseEachRow {
    static void reverseEach(int[][] arr){
    
        for(int i = 0; i< arr.length;i++){
        int left = 0;
        int right = arr[i].length-1;
        while(left < right){
            swap(arr,left,right);
            left++;
            right--;
        }

    }
}
    static void swap(int[][] arr , int left , int right){
        for(int i = 0; i< arr.length;i++){
        int temp = arr[i][left];
        arr[i][left] = arr[i][right];
        arr[i][right] = temp; 
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
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter array");
        // System.out.println("enter no. of rows1 ");
        // int r1 = sc.nextInt();
        // System.out.println("enter no. of columns1");
        // int c1 = sc.nextInt();
        // int[][] a = new int[r1][c1];
        // System.out.println("enter "+r1*c1 +" matrics values");
        // for(int i = 0;i<r1;i++){
        //     for(int j = 0; j<c1;j++){
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("original array:");
        printArray(a);
        
        reverseEach(a);
        System.out.println("after reversing each row:");
        printArray(a);
        
    }
    
}

    


    



