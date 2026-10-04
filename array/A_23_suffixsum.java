
package array;
public class A_23_suffixsum {
    static int[] makeSuffixSumArray(int[] arr) {
        int n = arr.length;
        int[] suffix = new int[n];
        // Last element
        suffix[n - 1] = arr[n - 1];
        // Start from second-last element
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
        int[] suf = makeSuffixSumArray(arr);
        printArray(suf);
    }
}
