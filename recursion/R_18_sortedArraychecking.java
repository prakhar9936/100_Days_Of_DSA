package recursion;
public class R_18_sortedArraychecking {
    //iterative method....
    // static boolean sortedArrayChecking(int[] arr) {
    //     for(int i = 0; i < arr.length - 1; i++) {
    //         if(arr[i] > arr[i + 1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //recursive method
    static boolean sortedArrayChecking(int[] arr,int n , int idx){
        if(idx == n-1){
            return true;
        }
      if(arr[idx]>arr[idx+1]){
        return false;
      } 
      return sortedArrayChecking(arr, n, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 11};
        // boolean result = sortedArrayChecking(arr);
        // if(result) {
        //     System.out.println("Yes, it is sorted");
        // } else {
        //     System.out.println("No, it is unsorted");
        // }

        int n = arr.length;
        boolean result = sortedArrayChecking(arr, n, 0);
        if(result) {
            System.out.println("Yes, it is sorted");
        } else {
            System.out.println("No, it is unsorted");
        }
    }
}