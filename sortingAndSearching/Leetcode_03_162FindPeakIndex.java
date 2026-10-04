package sortingAndSearching;
public class Leetcode_03_162FindPeakIndex{
    static int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if((mid == 0 || nums[mid]>nums[mid-1] ) && (mid == n-1 || nums[mid]>nums[mid+1])){
                return mid;
                
            }if(nums[mid]<nums[mid+1]){
                start = mid+1;
                }else {//nums[mid]>nums[mid+1]
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr ={ 1,2,1,3,5,6,4};
        System.out.println("Index Of peak element is :"+findPeakElement(arr));
    }

}