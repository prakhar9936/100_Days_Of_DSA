package array;

import java.util.Arrays;

public class A_06_Smallest_LargestElement {
    static int[] smallestLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,9,3,11,5};
         int[] ans = smallestLargestElement(arr);
         System.out.println("Smallest element: " + ans[0]);
        System.out.println("Largest element: " + ans[1]);
        
    }
    
}
