package recursion;

public class R_16a_linearSearch {
    //return that first index where target is present otherwise -1;
    static int findIndexLinearSearch(int[] arr, int n , int target , int idx){
        //base case
        if(idx >= n) return -1;
        if(arr[idx]==target) return idx;
        return findIndexLinearSearch(arr, n, target, idx+1);
        
    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,14,3,8,6,1};
         int target = 14;
         int n = arr.length;
        System.out.println(findIndexLinearSearch(arr, n, target, 0));
    }

    
}


