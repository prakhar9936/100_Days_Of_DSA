package sortingAndSearching;
public class P3_SortingOfSwapOneElementInArray {
    static void sortOfSwap(int[] arr){
        int n = arr.length;
        int x = -1;
        int  y =-1;
        if(n<=1) return ; // corner case for one element
        //process all adjacent element
        for(int i = 1; i< n ;i++){
            if(arr[i-1]>arr[i]){
            if(x == -1){//first conflict
                x = i-1;
                y = i;

            }  
            else {//2nd conflict
                y = i;
            } 
             }
            }
             int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void displayArry(int[] arr){
        for(int val : arr){
            System.out.print(val+ " " );
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        int[] num = {10,5,6,7,9,3};
        sortOfSwap(num);
        displayArry(num);

         int[] num1 = {3,8,6,7,5,9,10};
        sortOfSwap(num1);
        displayArry(num1);
        int[] num2 = {3};
        sortOfSwap(num2);
        displayArry(num2);

    }
    
}
