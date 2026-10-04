package array;

public class A_17b_SortArrayZeroesAndOnes {
    static void sortZeroesAndOnes(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
        if(arr[left] == 1 && arr[right] == 0){
            swap(arr,left,right);
            left++;
            right--;

        }
        if(arr[left] == 0 && arr[right] ==1){
            left++;
            right--;
        }
    }
}
    static void swap(int [] arr , int left , int right){
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    }
    static void printArray(int[] arr ){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,1,0,0,1,1,0};
        sortZeroesAndOnes(arr);
        System.out.println("the Sorted arr is:");
        printArray(arr);

    }
    
}
