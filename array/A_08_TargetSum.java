package array;

import java.util.Scanner;

public class A_08_TargetSum {
    static int targetSum(int[] arr, int target){
         int ans = 0;
        for(int i = 0;i<arr.length-1;i++){
           
            for(int j = i+1;j<arr.length;j++ ){
                int element = arr[i]+arr[j];
              if(target == element){
                ans++;
                
              }
              
            }
            
          
        }
       return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2,6,7,3,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target:");
        int target = sc.nextInt();
        int ans = targetSum(arr,target);
        System.out.println("Number of pairs: "+ans);

                    
    }
    
}
