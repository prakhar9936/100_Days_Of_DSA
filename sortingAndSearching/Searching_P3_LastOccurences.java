package sortingAndSearching;

public class Searching_P3_LastOccurences {
    static int lastOccurences(int[] arr, int x){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int ans = -1;
    
        while(st<= end){
            int mid = st +(end - st)/2;
            if(arr[mid] == x){
                ans = mid;
                st = mid+1;

            }else if(arr[mid] < x){
                st = mid+1;
            }else {
                end = mid-1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,5,5,6,6,6,8,9,9,9 };
        int x = 5;
        System.out.println(lastOccurences(arr, x));

    }
    
}
