package sortingAndSearching;

public class P1_moveZeroToEnd {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n-1;j++)
                if(arr[j] == 0 && arr[j+1] != 0){
                    swap(arr, j, j+1);
            
            }
        }
    }
        static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,4,2};
        sort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
