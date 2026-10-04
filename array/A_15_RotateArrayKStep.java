package array;

import java.util.Scanner;
//approach 1
public class A_15_RotateArrayKStep {
    static int[] rotate(int [] arr , int k ){
        int n  = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j  = 0;
        for(int i = n-k; i < n-1 ;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n-k-1;i++ ){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array ");
        for(int i = 0; i<n ;i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a k ");
        int k = sc.nextInt();
        int[] ans =rotate(arr, k);
        printArray(ans);
        
    }
    
}
