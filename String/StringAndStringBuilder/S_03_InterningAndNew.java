package String.StringAndStringBuilder;

public class S_03_InterningAndNew {
    public static void main(String[] args) {
        String Str ="Hello";
        String gtr = "Hello";
        // str--> Hello (address. x500)<-- gtr
        //interning used to save the space

        //NEW
        String x = new String("Hello");
        // x-->Hello (address.x700)
        //Str --> Hello (address.x500) <--Gtr

        ///Immutability
        String s = "hello";

        //hello -> heylo
        //s.charAt(2) ='y' // we dont change this 

        s = s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);//heylo

        //we can change only references but not acutal string itself;
    }
    
}
