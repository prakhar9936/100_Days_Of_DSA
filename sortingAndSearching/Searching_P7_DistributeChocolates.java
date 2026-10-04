package sortingAndSearching;

public class Searching_P7_DistributeChocolates {

    static boolean isDivisionPossible(int[] a, int m, int maxChocAllowed) {

        int numOfStudents = 1;
        int choc = 0;

        for (int i = 0; i < a.length; i++) {

            // One student cannot take more than max allowed
            if (a[i] > maxChocAllowed) {
                return false;
            }

            if (choc + a[i] <= maxChocAllowed) {
                choc += a[i];
            } else {
                numOfStudents++;
                choc = a[i];
            }
        }

        return numOfStudents <= m;
    }

    static int distributeChocolates(int[] a, int m) {

        // Not possible to give at least one group to every student
        if (a.length < m) {
            return -1;
        }

        int ans = 0;
        int st = 1;
        int end = (int) 1e9;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (isDivisionPossible(a, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] a = {5, 3, 1, 4, 2};
        int m = 3;

        System.out.println(distributeChocolates(a, m));
    }
}