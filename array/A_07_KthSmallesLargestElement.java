package array;

import java.util.Arrays;
import java.util.Scanner;

public class A_07_KthSmallesLargestElement {

    static int[] KthsmallestLargestElement(int[] arr,int k){
        // for(int i = 0 ; i < k;i++){
        Arrays.sort(arr);
       int kthSmallest = arr[k-1];
       int kthLargest = arr[arr.length-k];
        return new int[]{kthSmallest,kthLargest};
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Array of size");
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i = 0;i<n ;i++){
            arr[i] = sc.nextInt();
         }
         System.out.println("enter kth :");
         int k = sc.nextInt();
          if (k < 1 || k > n) {
            System.out.println("Invalid k");
            return;
        }

         System.out.println("kth smallest:" +arr[0]);
         System.out.println(" kth largest:" +arr[1]);


        
    }
    
}


