package String;

import java.util.Scanner;

public class S_01_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();//hello world
        // System.out.println(s);//hello
        String s1 = sc.nextLine();//hello world
        System.out.println(s1);//hello world
        char ch = s1.charAt(0);//hello world
        System.out.println(ch);
        for(int i = 0 ;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
       System.out.println(s1.substring(2,6));//2 to 5 index (not 6indx) all elemnet print only 
    //    System.out.println(s1.substring(2,12));// error without string lenght is less
    }
    
}
