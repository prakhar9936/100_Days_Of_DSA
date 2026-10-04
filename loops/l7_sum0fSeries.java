package loops;

import java.util.Scanner;

public class l7_sum0fSeries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0;i <= n ; i++){
            if(i % 2 == 0){
                ans -= i;
            }else {
                ans += i;
            }
        }
        System.out.println(ans);

    }
    
}
