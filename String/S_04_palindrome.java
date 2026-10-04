package String;
import java.util.Scanner;
public class S_04_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string s:");
        String s = sc.nextLine();
    
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("is palindrome: "+s);
        }else{
            System.out.println("not palindrome:"+rev);
        }

    }
    
}
