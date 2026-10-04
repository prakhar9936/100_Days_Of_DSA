package recursion;

public class R_14_MaxElementInArray {
    //iteration method
    // static void maxElement(int[] arr){
    //     int max = Integer.MIN_VALUE;
    //     for(int i =0; i<arr.length;i++){
    //         max = Math.max(arr[i],max);
    //     }
    //     System.out.println(max);
    // }

    //recursive method
    static int maxInArrayRecursive(int[] arr,int idx){
        //base case
        if(idx == arr.length-1){
            return arr[idx];
        }
//small problem
        int smallAns = maxInArrayRecursive(arr, idx+1);
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        int[] arr ={3,10,3,2,5};
        // maxElement(arr);
        System.out.println(maxInArrayRecursive(arr, 0));

    }
}
