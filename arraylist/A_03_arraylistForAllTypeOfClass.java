package arraylist;

import java.util.ArrayList;

public class A_03_arraylistForAllTypeOfClass {
    public static void main(String[] args) {
        //if we dont specify class , we can put anything inside l
        ArrayList l = new ArrayList<>();
        l.add("pqrs");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
    
}
