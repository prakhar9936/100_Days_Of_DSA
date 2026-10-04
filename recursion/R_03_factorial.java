package recursion;

import java.util.Scanner;

public class R_03_factorial {
    static int fact(int n){
        //base case
        if(n==0){
       return 1 ;  
        }
        // return n * fact(n-1);

        // small problem - recursive work
        int smallAns = fact(n-1);
        //big problem - self works
        int ans = n*smallAns;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int n = sc.nextInt();
            int a = fact(n);
            System.out.println("factorial of n:"+a);

        
    }
    
}
