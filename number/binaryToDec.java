package number;

import java.util.Scanner;

public class binaryToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num=sc.nextInt();
        int power =1;
        int ans = 0;
        while(binary_num>0){
            int unit_digit=binary_num % 10;
            ans += (unit_digit*power);
            binary_num /= 10;
            power *=2;
        }
        System.out.println(ans);


    }
    
}
