package arraylist;
import java.util.ArrayList;
public class A_02_arrayListAllMethods {

    public static void main(String[] args) {
      ArrayList<Integer> l1 = new ArrayList<>();
    //    ArrayList<String> l2 = new ArrayList<>();
    //     ArrayList<Float> l2 = new ArrayList<>();

    // add new element
    l1.add(5);
    l1.add(6);
    l1.add(7);
    l1.add(8);
    
    //get an element at index
    System.out.println(l1.get(1));//6

    //print the arraylist by forloop
    for(int i = 0 ;i<l1.size();i++){
        System.out.print(l1.get(i));//5 6 7 8

    }

    //directly print all element in arraylist
    System.out.println(l1);//[5,6,7,8]

    //adding element at some index
    l1.add(1,100);
    System.out.println(l1);//[5,100,5,7,8]

    //modifying element at index i
    l1.set(1,10);
    System.out.println(l1);//[5,10,6,7,8]

    //remove an element at index i 
    l1.remove(1);
    System.out.println(l1);//[5,6,7,8]

    //remove an element 
    l1.remove(Integer.valueOf(7));
    System.out.println(l1);//[5,6,8]

    System.out.println(l1.remove(Integer.valueOf(6)));//true
    System.out.println(l1.remove(Integer.valueOf(17)));//false
    System.out.println(l1);//[5,8]

    //checking if an element exist
    boolean ans = l1.contains(Integer.valueOf(5)); 
    System.out.println(ans);
    

        
    }
    
}


