package recursion;
import java.util.Scanner;
public class R_01_naturalNumberfrom1toN {
    static void printIncreasing(int n) {
        // Base case
        if (n == 1) {
            System.out.println(1);
            return;
        }
        // Recursive call
        printIncreasing(n - 1);
        // Work
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}