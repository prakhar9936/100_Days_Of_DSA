package pattern;
import java.util.Scanner;

public class P2_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("triangle");
        // for(int i = 1;i<=r;i++){
        //     for(int j = r ;j<=i;j++){
        //        System.out.print("*"); //*
        //                                  //**
        //                                 //***
        //     }
        //     System.out.println();
        // } 
        System.out.println("reverse triangle");
        for(int i = 1;i<=r;i++){
            for(int j = 1;j<=r+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //or
            for(int i = r;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
