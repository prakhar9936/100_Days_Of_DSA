package sortingAndSearching;

public class S4_QuickSort {

    static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }
    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        // Count elements <= pivot
        int elementLesserThanPivot = 0;
        for (int i = st; i <= end; i++) {
            if (arr[i] <= pivot) {
                elementLesserThanPivot++;
            }
        }
        // Find pivot's correct index
        int pivot_Index = st + elementLesserThanPivot - 1;
        // Put pivot at its correct position
        swap(arr, st, pivot_Index);
        int i = st;
        int j = end;
        // Smaller/equal elements on left
        // Greater elements on right
        while (i < pivot_Index && j > pivot_Index) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivot_Index && j > pivot_Index) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivot_Index;
    }
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 5, 4, 6};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        displayArray(arr);
    }
}