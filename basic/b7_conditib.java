package basic;
import java.util.Scanner;
public class b7_conditib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value % 5 == 0 || value % 3 == 0){
            System.out.println("No. is divisible 3 or 5 :"+value);
        } else {
            System.out.println(value +"  is  not divisible 3 or 5 ");

        }
        
    }
    
}
