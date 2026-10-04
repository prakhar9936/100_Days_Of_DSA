package loops;

public class L4_continue {
    public static void main(String[] args) {
        
         int n = 50;
         for( int num = 1;num <= n ;num++ ){
      
         if(num%3 == 0){
            num++;
            continue;
         }
        System.out.println(num);
        num++;
         }
     
    }
    
}
