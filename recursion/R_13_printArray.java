package recursion;
public class R_13_printArray {
    // Iterative method
    static void printArray1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Recursive method
    static void printArray2(int[] arr, int i) {
        // Base case
        if (i == arr.length) {
            return;
        }
        // Print current element
        System.out.print(arr[i] + " ");
        // Recursive call
        printArray2(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        // Iterative
        System.out.println("Iterative:");
        printArray1(arr);
        // Recursive
        System.out.println("Recursive:");
        printArray2(arr, 0);
    }
}