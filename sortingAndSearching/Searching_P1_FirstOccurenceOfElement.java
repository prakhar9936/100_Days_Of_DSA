package sortingAndSearching;

public class Searching_P1_FirstOccurenceOfElement {
    static int firstOccurences(int[] arr,int target){
        int n = arr.length;
        int start = 0 ; 
        int end = n-1;
         int ans = -1;
       while (start <= end) {
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
        }else if(arr[mid] > target){
            end = mid-1;
        }else {
            start = mid+1;
        }
       }
       return ans;
    }
 public static void main(String[] args) {
    int [] arr ={2,5,5,5,6,6,8,9,9,9};
    int target = 5;
    System.out.println(firstOccurences(arr, target));

  }   
}
