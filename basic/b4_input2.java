package basic;
import java.util.Scanner;

public class b4_input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
        System.out.println("quo :"+a/b);
        System.out.println("rem :"+a%b);
    }
    
}
