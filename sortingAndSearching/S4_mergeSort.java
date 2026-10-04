package sortingAndSearching;
public class S4_mergeSort {
    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int m = (l + r) / 2;
        // Sort left half
        mergeSort(arr, l, m);
        // Sort right half
        mergeSort(arr, m + 1, r);
        // Merge both sorted halves
        merge(arr, l, m, r);
    }
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        // Copy left half
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        // Copy right half
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        // Compare left and right elements
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        // Remaining left elements
        while (i < n1) {
            arr[k++] = left[i++];
        }
        // Remaining right elements
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
    static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 2, 33, 6, 1};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        displayArray(arr);
    }
}