package pattern;
import java.util.*;
public class p5_numericalRect2 {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 1; i <= r;i++){// for row
            for(int j = 1 ; j <= c ;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    
}

