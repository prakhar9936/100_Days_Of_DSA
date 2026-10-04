package recursion;

public class R_17_findAllIndexInLinearSearch {
    //iterative method
    // static void linearSearch(int[] arr,int target){
    // int n = arr.length;
    // for(int i = 0; i<n;i++){
    //  if(arr[i]== target){
    //     System.out.println(i);
    //  }
    // }

    // }

    static void linearSearch(int[] arr,int n , int target, int idx){
        //base case
        if(idx>=n){
            return;
        }
        //self work
        if(arr[idx]==target){
            System.out.println(idx);
        }
        //recursive work
        linearSearch(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5};
        int target = 2;
        // linearSearch(arr, target);
        int n = arr.length;
        linearSearch(arr, n, target,0);     
    }
    
}
