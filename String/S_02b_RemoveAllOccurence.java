package String;

import java.sql.Struct;

public class S_02b_RemoveAllOccurence {
    //approach :1 recursive by idx 
    static String removeCharacterInString(String s, int idx){
        //base case
        if(idx == s.length()){
            return " ";
        }
        //recursive work
        String smallAns =  removeCharacterInString(s, idx+1);
        char currentChar = s.charAt(idx);
        //self work
        if(currentChar != 'a'){
            return currentChar + smallAns;
       }else{
        return smallAns;
       }  
    }
    //Approach:2 Recursive without idx

    static String removeCharcterWithoutIDX(String s){
        if( s.length()==0) return " ";
        String smallAns = removeCharcterWithoutIDX(s.substring(1));
        char currentchar = s.charAt(0);
        if(currentchar != 'a') return currentchar+smallAns;
        else return smallAns;
    }
    public static void main(String[] args) {
        String s = "abcax";
       System.out.println(removeCharacterInString(s, 0));
       
    System.out.println(removeCharcterWithoutIDX(s));
    }
}
    

