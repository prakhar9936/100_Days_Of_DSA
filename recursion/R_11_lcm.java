package recursion;

import java.util.Scanner;

public class R_11_lcm {

    // Brute Force — Multiples 
static int lcm(int a, int b) {
    int max = Math.max(a, b);

    while (true) {
        if (max % a == 0 && max % b == 0) {
            return max;
        }
        max++;
    }

}
//best approach using gcd
static int gcd3(int x,int y){
        if(x==0 ) return y;
        if(y == 0) return x;
        return gcd3(y,x%y);
    }
static int lcm2(int a, int b) {
    return (a / gcd3(a, b)) * b;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number:");
        int a = sc.nextInt();
        System.out.println("enter a second number :");
        int b =sc.nextInt();
System.out.println("LCM using factor = " + lcm(a, b));
System.out.println("LCM using gcd = " + lcm(a, b));
       


    }
    
}

    

