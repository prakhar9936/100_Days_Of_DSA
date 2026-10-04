package sortingAndSearching;

public class Searching_P5_findTargetIndexInRotatedSortedArray {
    static int targetIndex(int[] arr,int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target ){
                return mid;
            }else if(arr[mid]<arr[end]){
                //mid -> end sorted h..
                if(target > arr[mid] && target<=arr[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else{
                //arr[mid]>arr[end] // st -> ,id sorted hai..
                if(target>= arr[start] && target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;

        }
    
    public static void main(String[] args) {
        int [] arr= {12,14,15,1,2,4,5,6,8,9};
        System.out.println("index no.:"+targetIndex(arr, 5));
System.out.println("index is: "+targetIndex(arr, 3));
          System.out.println("index no.:"+targetIndex(arr, 14));

    }
    
}
