package String;

public class S_06b_SubsequencesWithVoidReturnType {
    //sc: O(n+1)(n) ==> O(n^2)
    static void printSSQ(String s, String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return ;
        }
        char currChar = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns+currChar);
        printSSQ(remString, currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc", " ");
    }
    
}
