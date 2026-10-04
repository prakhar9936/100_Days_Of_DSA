package loops;
import java.util.*;
public class L5_sumofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num =0;
        while(n>0){
         num = n % 10;
         sum = sum + num;
         n = n / 10 ;

        }
        System.out.println(sum);
    }
}
