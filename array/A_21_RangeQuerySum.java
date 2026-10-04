package array;

import java.util.Scanner;

public class A_21_RangeQuerySum {

//prefix sum
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n ;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
       int[] prefSum = makePrefixSumArray(arr);
       System.out.println("enter number of queries:");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
         System.out.println("enter range");
         int l = sc.nextInt();
         int r = sc.nextInt();
 

         int ans = prefSum[r] - prefSum[l-1];
         System.out.println("sum : " +ans);
        }
                  
    }
    
}

    

    
