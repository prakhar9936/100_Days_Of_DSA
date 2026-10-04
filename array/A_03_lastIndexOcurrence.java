
package array;
import java.util.*;


public class A_03_lastIndexOcurrence {

    static int lastIndexOccurences(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+ n +" elements: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER x");
        int x = sc.nextInt();
        System.out.println("last occurrences OF X: "+lastIndexOccurences(arr, x));

    }
    
}

    

