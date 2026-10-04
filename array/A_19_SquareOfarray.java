
package array;
public class A_19_SquareOfarray {
    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        // Fill from last index because we are
        // selecting the largest square first
        int k = n - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 10};
        int[] minus = {-10, -3, -2, 1, 4, 5};
        System.out.println("Original arr:");
        printArray(arr);
        System.out.println("Original minus:");
        printArray(minus);
        System.out.println("Sorted square array:");
        int[] ans = sortSquare(arr);
        printArray(ans);

        System.out.println("Sorted square array of minus:");
        int[] minusArray = sortSquare(minus);
        printArray(minusArray);
    }
}

