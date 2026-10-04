package number;

import java.util.Scanner;

public class n4_absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n<0){
            n=n*(-1);
           
        }
         System.out.println("absolute " + n);

    }
}
