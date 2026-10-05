package String.StringAndStringBuilder;

public class S_01_basic {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);

        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.indexOf('e'));

        String ftr ="abc";
        String gtr ="abc";
        String itr ="aba";
        String mtr ="zbc";
        System.out.println(ftr.compareTo(gtr));// 0 
        System.out.println(ftr.compareTo(itr));//abc,aba : c-> 3 and a-> 1 thatwhy 2
        System.out.println(ftr.compareTo(mtr));//abc , zbc :a-> 1 and z->-26 and thatwhy -25

        String s = "Prakhar";
        System.out.println(s.contains("kha"));// true
        System.out.println(s.contains("kzr"));//false

        System.out.println(s.startsWith("Prak"));//true
        System.out.println(s.startsWith("khar"));//false

        System.out.println(s.endsWith("har"));//true
        System.out.println(s.endsWith("arh"));//false

        String s1 = "Prakhar Agrawal";
        System.out.println(s1.toLowerCase());//prakhar agrawal
        System.out.println(s1.toUpperCase());//PRAKHAR AGRAWAl

        String firstName = "Prakhar";
        String secondName ="Agrawal";
        System.out.println(firstName.concat(secondName));



    }
    
}
