package sortingAndSearching;

public class S1_bubbleSort {
    static void sort(int [] arr){
        int n = arr.length-1;
        for(int i = 0 ;i<n;i++){
            boolean flag = false;
            for(int j = 0; j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;//some swap happen
                }
            }
            if(!flag)// have any swap happen.
             break;
        }
    }
    static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr= {7,6,5,4,2};//worst case:o(n^2) and best case: 1,2,3,4  o(1) by (adding flag variable)
        sort(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
        
    }
    
}
