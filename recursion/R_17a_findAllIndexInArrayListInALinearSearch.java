package recursion;

import java.util.ArrayList;
public class R_17a_findAllIndexInArrayListInALinearSearch {
    // Iterative approach
    // static ArrayList<Integer> linearSearch(int[] arr, int target) {
    //     ArrayList<Integer> result = new ArrayList<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             result.add(i);
    //         }
    //     }
    //     return result;
    // }

    //recursive method
        static ArrayList<Integer> linearSearch(int[] arr, int target, int idx) {
        ArrayList<Integer> result = new ArrayList<>();
        // Base case
        if (idx == arr.length) {
            return result;
        }
        // Current element
        if (arr[idx] == target) {
            result.add(idx);
        }
        // Recursive call
        ArrayList<Integer> smallResult =
                linearSearch(arr, target, idx + 1);
        // Combine results
        result.addAll(smallResult);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 4};
        int target = 4;
        // ArrayList<Integer> result = linearSearch(arr, target);
        // System.out.println(result);

    ArrayList<Integer> result =
    linearSearch(arr, target, 0);
    System.out.println(result);
    }
}