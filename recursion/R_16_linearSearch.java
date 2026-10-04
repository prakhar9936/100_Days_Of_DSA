package recursion;

public class R_16_linearSearch {
    //iterative method
    // static void linearsearch(int[] arr, int target){
    //     int n = arr.length;
        
    //     for(int i = 0;i<n;i++){
    //         if(arr[i] == target){
    //             System.out.println("yes");
    //             return;
    //         }  
    //     }
    //     System.out.println("no");
    // } 

    //recursive method
    static boolean linearSearch(int[] arr,int target,int n ,int idx){
    //base case
        if(arr[idx] >= n) {
        return false;
    }
    //self work
    if(arr[idx]==target )return true;
    //recursive work
    return linearSearch(arr, target, n, idx+1);
  
    }
    //return that  index where target is present otherwise -1;
    static int findIndexLinearSearch(int[] arr, int n , int target , int idx){
        //base case
        if(arr[idx]>=n) return -1;
        if(arr[idx]==target) return idx;
        return findIndexLinearSearch(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,14,3,8,6,1};
         int target = 14;
         int n = arr.length;
        if(linearSearch(arr, target, n, 0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println(findIndexLinearSearch(arr, n, target, 0));
    }

    
}
