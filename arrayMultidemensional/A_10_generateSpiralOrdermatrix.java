package arrayMultidemensional;

import java.util.Scanner;

public class A_10_generateSpiralOrdermatrix {

    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;
        int current = 1;
        while (current <= n * n) {
            // Top Row: Left -> Right
            for (int j = leftCol; j <= rightCol; j++) {
                if (current <= n * n) {
                    matrix[topRow][j] = current;
                    current++;
                }
            }

            topRow++;
            // Right Column: Top -> Bottom
            for (int i = topRow; i <= bottomRow; i++) {
                if (current <= n * n) {
                    matrix[i][rightCol] = current;
                    current++;
                }
            }
            rightCol--;
            // Bottom Row: Right -> Left
            for (int j = rightCol; j >= leftCol; j--) {
                if (current <= n * n) {
                    matrix[bottomRow][j] = current;
                    current++;
                }
            }
            bottomRow--;

            // Left Column: Bottom -> Top
            for (int i = bottomRow; i >= topRow; i--) {

                if (current <= n * n) {
                    matrix[i][leftCol] = current;
                    current++;
                }
            }

            leftCol++;
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n to generate the spiral order matrix:");

        int n = sc.nextInt();

        int[][] matrix = generateSpiralMatrix(n);

        System.out.println("Generated Spiral Matrix:");

        printMatrix(matrix);

        sc.close();
    }
}