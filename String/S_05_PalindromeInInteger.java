package String;

public class S_05_PalindromeInInteger{
    
    //itervative
    static boolean ispalindrome(String n){
        int l = 0;
        int r = n.length()-1;
        while(l<r){
            if(n.charAt(l) != n.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
     //recursive
     static boolean isPalindromeRecursive(String n, int l , int r){
        if(l>=r) return true;
        if(n.charAt(l)!=n.charAt(r)) return false;
        return isPalindromeRecursive(n, l+1, r-1);
     }
    public static void main(String[] args) {
        String n = "34543";
        // System.out.println(ispalindrome(n));
        System.out.println(isPalindromeRecursive(n, 0, n.length()-1));

    }
    
}
