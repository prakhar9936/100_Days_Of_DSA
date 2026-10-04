package String;

public class S_03_reverseIterative {
    public static void main(String[] args) {
        String s = "abcde";
        String rev = "";

        for(int i = s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
          
    }
    
}
