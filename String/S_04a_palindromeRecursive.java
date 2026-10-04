package String;
import java.util.Scanner;
public class S_04a_palindromeRecursive {
    //approach:1 with idx
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";
        String smallAns = reverse(s, idx+1);
        return smallAns+s.charAt(idx);
    }
      //approach :2: without idx
    static String reverseWithoutIDX(String s){
        if(s.length() == 0) return "";
        String smallAns = reverseWithoutIDX(s.substring(1));
        return smallAns+ s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // String rev = reverse(s, 0);

        String rev = reverseWithoutIDX(s);
        if(s.equals(rev)){
            System.out.printf("%s is palindrome",s);
        }
        else{
              System.out.printf("%s is not palindrome",s);
        }


    }
    
}
