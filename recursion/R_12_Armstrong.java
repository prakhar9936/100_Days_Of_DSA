import java.util.Scanner;

public class R_12_Armstrong {
    static int countDigits(int n) {
        if (n == 0)
            return 1;
        return 1 + countDigits(n / 10);
    }
    static int power(int digit, int n) {
        if (n == 0)
            return 1;
        return digit * power(digit, n - 1);
    }
    static int armstrongSum(int n, int digits) {
        if (n == 0)
            return 0;
        int digit = n % 10;
        return power(digit, digits)
                + armstrongSum(n / 10, digits);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int digits = countDigits(n);
        int sum = armstrongSum(n, digits);

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}