package sortingAndSearching;

public class S2_SelectionSort {
    static void sort(int [] arr){
        int n = arr.length;
        for(int i = 0 ;i< n-1;i++){
            int min_index=i;
          for(int j = i+1;j<n;j++){
            if(arr[j]<arr[min_index]){
               min_index = j;
            }

          }
          swap(arr,i,min_index);
        }
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
   
    public static void main(String[] args) {
        int[] arr = {7,5,4,1,3};
        
        sort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
