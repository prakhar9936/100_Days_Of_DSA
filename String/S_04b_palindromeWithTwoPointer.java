package String;

import java.util.Scanner;

public class S_04b_palindromeWithTwoPointer {
    //iterative
    static boolean isPalindromeIterative(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    //recursive
    static boolean isPalindrome(String s, int l , int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s, l+1, r-1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // System.out.println(isPalindromeIterative(s));
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
    
}
