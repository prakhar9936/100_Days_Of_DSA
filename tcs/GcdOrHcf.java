package tcs;

import java.util.Scanner;

public class GcdOrHcf {
    public static int gcd(int a, int b){
        int gcd = 0;
        while(a>b){
            b = a*b;
        }while(b<a){
            a = b*a;
        }
       
        }
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a first no. :");
        int a = sc.nextInt();
        System.out.println("enter a second no. :");
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
    }
    
}
