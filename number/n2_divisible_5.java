package number;
import java.util.Scanner;
public class n2_divisible_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println("divisble 5");
        } 
        else{
            System.out.println("not");
        }
    }
    
}
