package ScopeOfvariable;

class Algebra{
    int a = 10; // member variable
    int b = 5;
    int add(){
        int p = 100;
        int q = 200;
        return p+q;

    }
    int sub(){
        return a-b;
        //return p-q; /// there it does not know what is p and q ;
    }
}   
public class methodLevelScope {

    public static void main(String[] args) {
        
    }
    
    
}

    

