package recursion;
import java.util.Scanner;
public class R_10_gcd_hcf {
    //brute forces approach
    static int gcd1(int a , int b){
        int ans = 1;
        for(int i = 1; i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        return ans;
    }

    //long division method
    static int gcd2(int x, int y){
        while(x%y != 0){
          int rem = x%y;
         x = y ;
         y = rem;
        }
        return  y;
    }

    //best approach :Euclid's algo // by recursion
    //gcd(x,y) = gcd(y,x%y) ,, gcd(x,0)=x
    static int gcd3(int x,int y){
        if(x==0 ) return y;
        if(y == 0) return x;
        return gcd3(y,x%y);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number:");
        int a = sc.nextInt();
        System.out.println("enter a second number :");
        int b =sc.nextInt();
        System.out.println("Brute force:"+gcd1(a, b));
        System.out.println("Long division method: "+gcd2(a, b));
        System.out.println("best approach (euclid's algo: "+gcd3(a, b));


    }
    
}
