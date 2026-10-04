package sortingAndSearching;

public class S3_InsertionSort {
    static void sort(int[] arr){
        for(int i = 1 ;i< arr.length;i++){
            for(int j = i  ;j>0;j--){// int j = i; while(j>0 && arr[j]<arr[j-1]){swap(arr[j],arr[j-1]);} j--;}
              if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
              }else{
                break;
              }


            }
        }
    }
        static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sort(arr);
        for(int newArr:arr){
            System.out.print(newArr+ " ");

        } 
    }
    
}
