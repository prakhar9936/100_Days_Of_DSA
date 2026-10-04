package String;

import java.util.ArrayList;

public class S_06_Subsequences {
    // Iterative method
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = new ArrayList<>();
        // Start with empty subsequence
        ans.add("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Store the current size
            int size = ans.size();
            // Add current character to existing subsequences
            for (int j = 0; j < size; j++) {

                ans.add(ans.get(j) + ch);
            }
        }
        System.out.println(ans);
    }
}