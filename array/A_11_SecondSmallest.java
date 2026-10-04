package array;
public class A_11_SecondSmallest {
    static int secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 9, 4, 7, 1};
        int ans = secondSmallest(arr);
        System.out.println("Second Min element: " + ans);
    }
}