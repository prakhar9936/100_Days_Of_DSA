package ScopeOfvariable;

class BlockAlgebra {

    void demo() {
        // Variable 'a' has method/block scope
        int a = 10;
        System.out.println(a);
        // System.out.println(b); // ❌ b cannot be accessed here
        // First inner block
        {
            int b = 20;
            System.out.println(b); // ✅ b is accessible inside this block
            System.out.println(a); // ✅ a is accessible inside inner block
        }
        // System.out.println(b); // ❌ b's scope ended
        System.out.println(a); // ✅ a is still accessible
        // Second inner block
        {
            int b = 30;
            System.out.println(b); // ✅ different b variable
            System.out.println(a); // ✅ a is accessible
        }
        // System.out.println(b); // ❌ b's scope ende
        for(int i = 0; i<5 ; i++){
            System.out.println(i);
            int b =100;
            System.out.println(b);

        }
        //sout(i); // show error
            if(true){
            int b = 200;
            System.out.println(b);

        }
    }
}

public class blockLevelscope {

    public static void main(String[] args) {

        BlockAlgebra alg = new BlockAlgebra();

        alg.demo();
    }
}