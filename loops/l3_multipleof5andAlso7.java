package loops;

import java.util.Scanner;

public class l3_multipleof5andAlso7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 1;
        while(true){
            if(num % 5 == 0 && num % 7 ==0){
                System.out.println(" first multiple of 5 and 7:"+num);
                break;
            }
            num++; 
        }
    }
    
}
