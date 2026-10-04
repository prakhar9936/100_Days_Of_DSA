package recursion;
import java.util.Scanner;
public class R_02_NaturalNumberNto1 {
    static void printDecreasing(int n){
       // base case
        if(n == 1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);// self work
        printDecreasing(n-1);//sub problem 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        printDecreasing(n);




    }
    
}
