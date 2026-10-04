package recursion;
import java.util.Scanner;
public class R_07_powerPQ {
    //p^q = p p*p*p...p in q times
    //Approach 1
    static int power(int p , int q){
        if(q==0) return 1;//base
        return power(p,q-1)*p;
    }
    //approach 2
    static int pow(int p ,int q){
        if(q==0) return 1;
        int smallpow = pow(p,q/2);
        if(q%2==0){ 
          return smallpow*smallpow;
        }
        return p*smallpow*smallpow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a p");
        int p = sc.nextInt();
        System.out.println("enter a q");
        int q = sc.nextInt();
        System.out.println("approach_1:"+power(p,q));
        System.out.println("approach_2:"+pow(p, q));
        
    }
    
}
