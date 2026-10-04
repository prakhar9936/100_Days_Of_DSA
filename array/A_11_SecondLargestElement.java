package array;

import java.util.Arrays;

public class A_11_SecondLargestElement {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,5,3,5};
        System.out.println("max element: "+findMax(arr));
        System.out.println("Second max Element :" +findSecondMax(arr));

        
    }
}
//     static int secondLargest(int[] arr) {

//         Arrays.sort(arr);

//         int largest = arr[arr.length - 1];

//         for (int i = arr.length - 2; i >= 0; i--) {
//             if (arr[i] != largest) {
//                 return arr[i];
//             }
//         }

//         return -1;
//     }
//     public static void main(String[] args) {

//         int[] arr = {9, 8, 9, 6, 9, 5, 8};

//         int ans = secondLargest(arr);

//         System.out.println("Second largest: " + ans);
//     }
// }