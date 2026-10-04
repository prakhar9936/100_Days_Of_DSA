package array;

import java.util.Scanner;

public class A_09_TargetSumOfTriplet {
    static int targetSumTriplets(int[] arr , int target){
        int ans = 0;
        for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    int element = arr[i]+arr[j]+arr[k];
                    if(target == element){
                        ans++;
                        System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
                    }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr ={1,4,5,6,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int ans = targetSumTriplets(arr, target);
        System.out.println("No. of triplets whose sum is equal is target:"+ans);
        
    }
    
}
