package array;

public class A_20b_prefixSum {

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;

        for(int i = 1; i<n ;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
       int[] pref= makePrefixSumArray(arr);
        printArray(pref);

    
    }
    
}

    
