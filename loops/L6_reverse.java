package loops;
import java.util.*;
public class L6_reverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num ;
        int rev = 0;
        while(n>0){
        num = n % 10;
        rev = rev * 10 + num;
        n = n/10;
        }
        System.out.println(rev);
    }
    
}
