package recursion;

import java.util.Scanner;

public class R_09_seriesSum {
    //n = 5 
    // 1-2+3-4+5   o/p: 3
    //iterative menthod
    // static void series(int n ){
    //     int ans = 0;
    //     for(int i = 1 ;i<=n;i++){
    //         if(i%2 == 0){
    //             ans = ans-i;
    //         }
    //         else {
    //             ans = ans+i;
    //         }
    //     }
    //     System.out.println(ans);

    // }

    // recursive method
    static int series(int n){
        //base case
        if(n == 0) return 0;
        if(n%2==0){
            //even
        return series(n-1)-n;
        }else{
        //old
        return series(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nums");
        int nums = sc.nextInt();
        //series(nums);
        System.out.println(series(nums));

    }
    
}
