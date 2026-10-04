package sortingAndSearching;
//19,-20,7,-4,-13,11,-5,3 
//o/p -20,-4,-13,-5,197,11,3

public class P4_partition {
    static void negativeAndPositive(int [] arr){
        int n = arr.length;
           int l = 0;
           int r =n-1;

        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>= 0) r--;
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

     static void displayArry(int[] arr){
        for(int val : arr){
            System.out.print(val+ " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {19,-20,7,-4,-13,11,-5,3};
        negativeAndPositive(nums);
        displayArry(nums);
    }
    
}
