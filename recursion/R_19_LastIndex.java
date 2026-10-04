package recursion;
public class R_19_LastIndex {
    static int lastIndex(int[] arr, int target, int idx) {
        // Base case
        if (idx < 0) {
            return -1;
        }
        // Target found
        if (arr[idx] == target) {
            return idx;
        }
        // Move left
        return lastIndex(arr, target, idx - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 4};
        int target = 4;
        System.out.println(lastIndex(arr, target, arr.length - 1));
    }
}