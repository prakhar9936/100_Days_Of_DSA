package tcs;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int count = 0;
        
        int original = n;
        while(original != 0){
            count++;
            original = original /10 ;
        }
        while(n != 0){
            int digit = n%10;
           int power = 1;
           for(int i = 1; i<= count ; i++){
            power = power*digit;
           }
           sum = sum + power;
           n = n / 10;
        }
        if(temp == sum)  System.out.println("Armstrong no.");
        else System.out.println("Not armstrong");
    }
    
}
