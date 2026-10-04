package array;

public class A_14b_reverseArrayInPlace {
static void reverseArrayInplace(int [] arr) {
    int  first = 0;
    int  last = arr.length-1;
    while(first < last){
      swapInArray(arr,first,last);
      first++;
      last--;
    }

}
static void swapInArray(int[] arr , int first , int last){
  int temp = arr[first];

  arr[first] = arr[last];
  arr[last] = temp;
}

 static void printArray(int[] arr){
  for(int i = 0; i < arr.length;i++){
    System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      int []  arr = {1,2,3,4,5,6};
      int[] arr1 = {1,2,3,4,5};
        reverseArrayInplace(arr);
        printArray(arr);

        reverseArrayInplace(arr1);
        printArray(arr1);
    }
    
}
