package String;

public class S_02a_RemoveAllOccurrences {

    public static void main(String[] args) {
        String s ="abcax";
        //iterative method
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}