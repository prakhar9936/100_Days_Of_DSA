package String.StringAndStringBuilder;
import java.util.*;
public class SB_01_basic {
    //String Builder
    public static void main(String[] args) {
        //decalaration
        StringBuilder s = new StringBuilder("hello");
        System.out.println(s);
       
        System.out.println( s.append(" world"));

        //initializing by user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a string: ");
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // System.out.println(str);

        //setCharAt(idx,ch)
        StringBuilder st = new StringBuilder("Hello");
        System.out.println(st);//Hello
        st.setCharAt(0, 'y');
        System.out.println(st);//yello

        //append(string) ,append(int) ,append(chae)...
        StringBuilder gt = new StringBuilder("Hello");
        System.out.println(gt.append(" world"));
        System.out.println(gt.append('y'));
        System.out.println(gt.append(10));

        //insert(idx,char)
         StringBuilder ft = new StringBuilder("Hello");
         System.out.println(ft);
         ft.insert(2,'y');//heyllo
         System.out.println(ft);

         //deleteCharAt(idx)
           StringBuilder ht = new StringBuilder("Hello");
           ht.deleteCharAt(2);
           System.out.println(ht);
           ht.delete(0, 2);
           System.out.println(ht);

           //reverse()
             StringBuilder jt = new StringBuilder("Hello");
            System.out.println(jt.reverse());


       
        
    }
    
}
