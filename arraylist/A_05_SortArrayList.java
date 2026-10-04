package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class A_05_SortArrayList {
    
    public static void main(String[] args) {
        
      ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(10);
    list.add(3);
    list.add(5);
    list.add(22);
    list.add(10);

    System.out.println("Original list"+list);
    Collections.sort(list);
    System.out.println("Ascending order:"+list);

    Collections.sort(list,Collections.reverseOrder());
    System.out.println("desecnding order:"+list);

    //String Sorting 
    ArrayList<String> l1 = new ArrayList<>();
    l1.add("welcome");
    l1.add("to");
    l1.add("physics");
    l1.add("wallah");

    System.out.println("Original list"+l1);
    
    Collections.sort(l1);
    System.out.println("Sorted"+l1);

    Collections.sort(l1,Collections.reverseOrder());
    System.out.println("Desc. order:"+l1);
    }
}
