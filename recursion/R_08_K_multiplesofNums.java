package recursion;

import java.util.Scanner;

public class R_08_K_multiplesofNums {
    //iterative approach
    // static void multiples(int nums,int k){
    //     int value = 0;
    //     for(int i = 1;i<=k;i++){
    //      value  =   nums*i;
    //      System.out.println(value);
    //     }
    // }

    //recursive
    static void multiples(int nums,int k){
        //base case 
        if(k == 1) {
        System.out.println( nums);
        return ;
        }
        //recursive work
        multiples(nums, k-1);
        //self work
        System.out.println(nums*k);
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nums");
        int nums = sc.nextInt();
        System.out.println("enter a k");
        int k = sc.nextInt();
        multiples(nums, k);
    }
    
}
