package array;
public class A_17a_SortArrayZeroesAndOnes {
    static void sortZeroAndOne(int[] arr) {
        int n = arr.length;
        int countZeroes = 0;
        // Count zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZeroes++;
            }
        }
        // Put zeroes first and ones after them
        for (int i = 0; i < n; i++) {
            if (i < countZeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        sortZeroAndOne(arr);
        System.out.println("The sorted array:");
        printArray(arr);
    }
}