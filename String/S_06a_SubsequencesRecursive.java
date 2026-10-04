package String;
import java.util.ArrayList;
public class S_06a_SubsequencesRecursive {
 static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // Base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> SmallAns = getSSQ(s.substring(1));
        // Add current character or don't add current character
        for (String ss : SmallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        System.out.println(ans);
    }
}