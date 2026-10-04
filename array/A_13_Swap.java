package array;

public class A_13_Swap {
    static void swapWithTemp(int a,int b){
        System.out.println("Value of a before swap: " +a);
        System.out.println("Value of b before swap: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a after swap: "+a);
        System.out.println("Value of b after swap: "+b);

     
    } 
    static void swapWithoutTemp(int a , int b){

        System.out.println("Value of a before swap: " +a);
        System.out.println("Value of b before swap: "+b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a after swap:"+a );
        System.out.println("Value of b after swap :" +b);
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        System.out.println("-------->with the temp variable:" );
      
        swapWithTemp(a,b);
          System.out.println("-------->without temp variable");
        swapWithoutTemp(a, b);
        
    }
    
}
