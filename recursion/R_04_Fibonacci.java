package recursion;

import java.util.Scanner;

public class R_04_Fibonacci {
    static int fibo(int n){
        //base case
        if(n==0) return 0;
        if (n==1) return 1;
    
    return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term");
        //for series print 
        //for(int i = 0;i<=n;i++)
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println("Fibonacci number of"+n+"th term is:"+ans);

    }
    
}
