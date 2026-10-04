package loops;
import java.util.*;

public class L2_StreamofNums {
    public static void main(String[] args) {
        
    
    Scanner  sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0 ;

    // while(num != -1){
    //  sum += num;
    //  num = sc.nextInt();
    // }
    // System.out.println(sum);

    do{
        sum += num;
        num = sc.nextInt(); 

    }while(num != -1);
     System.out.println(sum);
}
}
