package recursion;
public class R_15_SumInArray {
    //iterative method
    // static void sumInArray(int[] arr){
    //     int sum = 0;
    //     for(int i = 0 ;i<arr.length;i++){
    //         sum += arr[i];
    //     }
    //     System.out.println(sum);
    // }

    //recursive method
    static int sumInArray(int[] arr,int idx){
        if(idx == arr.length-1) return arr[idx];
        //recursive call
        int smallproblem = sumInArray(arr, idx+1);
        //current element + sum of remaining element
        return arr[idx]+smallproblem;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,5,20,1};
      
        System.out.println("sum of arr element: "+sumInArray(arr,0));
    }
    
}
