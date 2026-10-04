package array;

import java.util.Scanner;

public class A_05_sortedChecking {
    static boolean isSorted(int[] arr){
        boolean checkSort = true;
        for(int i = 1;i < arr.length;i++){
        if(arr[i] < arr[i-1]){
            checkSort = false;//npt  sorted
            break;
        }
    }
    return checkSort;
}
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("enter "+ n +" elements: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Is sorted: "+isSorted(arr));

  
    }
    
}
