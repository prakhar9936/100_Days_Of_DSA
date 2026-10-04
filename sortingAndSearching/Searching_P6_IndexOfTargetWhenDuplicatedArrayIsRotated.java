
package sortingAndSearching;
public class Searching_P6_IndexOfTargetWhenDuplicatedArrayIsRotated {
    static int searchInDuplicated(int[] arr, int target) {
    int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Target found
            if (arr[mid] == target) {
                return mid;
            }
            // Duplicates: cannot decide which half is sorted
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Right half is sorted
            else if (arr[mid] <= arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Left half is sorted
            else {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = {1, 1, 1, 2, 3, 3, 1};

        System.out.println(searchInDuplicated(a, 1));
        System.out.println(searchInDuplicated(a, 2));
        System.out.println(searchInDuplicated(a, 3));
        System.out.println(searchInDuplicated(a, 0));
    }
}

