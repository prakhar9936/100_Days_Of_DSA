package sortingAndSearching;

public class Searching_05a__binarySearchingRecursive {
//recursive approach
static boolean bs(int[] arr,int start, int end,int target ){
    if(start>end) return false;
    int mid = start+(end-start)/2;
    if(arr[mid]== target) return true;
    else if(arr[mid]>target){
       return bs(arr,start,mid-1,target);
    }else{
       return  bs(arr, mid+1, end, target);
    }
}
public static void main(String[] args) {
    int [] arr ={2,4,5,7,15,20,24,45,50,77};
    int n = arr.length;
   System.out.println(bs(arr, 0, n-1, 24));
    
}    
}
