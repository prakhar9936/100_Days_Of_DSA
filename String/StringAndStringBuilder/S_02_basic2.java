package String.StringAndStringBuilder;

public class S_02_basic2 {
    public static void main(String[] args) {
        String s3 = "abc";
        s3 += "def";//string
        System.out.println(s3);

        s3 += 'r';//char
        System.out.println(s3);//abcdefr

        s3 +=10;//integer
        System.out.println(s3);//abcdefr10

        String str = "abd";
        System.out.println(str+10+10);//abd1010  not-> abd20
        System.out.println(str+(10+10));//abd20

        //Substring--continuous part of string 

        String s ="abcd";
        System.out.println(s.substring(0, 3));// 0 to (3-1) // abc
        System.out.println(s.substring(0));


    }
    
}
