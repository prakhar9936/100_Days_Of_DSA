package sortingAndSearching;

public class Searching_P4_findMinRotatedArray {
    static int findMin(int[] arr){
        int n = arr.length;
        int ans =-1;
        int start = 0;
        int end = n-1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[n-1]){
                start = mid+1;
            }
            else if(arr[mid]<=arr[mid]){
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={3,4,5,1,2};
       System.out.println(findMin(arr));
        
    }
    
}
