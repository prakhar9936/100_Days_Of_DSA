package String.StringAndStringBuilder;
// import  java.util.*;

public class S_P01_PrintAllSubString {
    public static void main(String[] args) {
        String str ="abcd";
        for(int i = 0; i<str.length();i++){
            for(int j = i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
            

        }
       
    }
    
}
