package array;

import java.util.Scanner;

public class A_16ArrayQueries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size of array
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Since elements < 10^5
        int[] present = new int[100000];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            present[arr[i]] = 1;
        }

        // Number of queries
        int q = sc.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();

            if (present[x] == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}