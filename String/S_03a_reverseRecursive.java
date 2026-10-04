package String;
public class S_03a_reverseRecursive {
    //approach:1 : with idx
    static String reverse(String s, int idx) {
        if (idx == s.length())
            return "";
        String smallans = reverse(s, idx + 1);
        return smallans + s.charAt(idx);
    }
    //approach :2: without idx
    static String reverseWithoutIDX(String s){
        if(s.length() == 0) return " ";
        String smallAns = reverseWithoutIDX(s.substring(1));
        return smallAns+ s.charAt(0);
    }
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(reverse(s, 0));

        System.out.println(reverseWithoutIDX(s));
    }
}