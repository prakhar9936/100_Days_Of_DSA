package recursion;

import java.util.Scanner;

public class R_06_countDigit {
    static int countDigit(int n){
        if(n>0 && n<=9){
            return 1;
        }
        return 1+countDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(countDigit(n));
    }
    
}
