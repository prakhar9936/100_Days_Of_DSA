package References;




public class passbyValue {
        void changeValue(int a ){
        a *= 100;
        System.out.println("inside"+a);
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before:"+a);
        System.out.println("after:"+a);
 
    }
    
}
