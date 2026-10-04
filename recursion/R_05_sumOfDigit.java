package recursion;

import java.util.Scanner;

public class R_05_sumOfDigit {
    static int sumOfDigit(int n ){
        //base case
        if(n>0 & n<=9){
            return n;
        }
        return sumOfDigit(n/10)+n%10;
        //             first d-1 digit + last digit
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(sumOfDigit(n));
    }
}
