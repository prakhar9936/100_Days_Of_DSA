package arrayMultidemensional;

import java.util.*;

public class A_12_AnticlockwiseOfSpiralOrder {

    static void AntiClockwiseOfspiralOrder(int[][] matrix, int r, int c) {

        int topRow = 0;
        int bottomRow = r - 1;
        int leftCol = 0;
        int rightCol = c - 1;

        int totalMatrixElement = 0;

        while (totalMatrixElement < r * c) {

            // 1. Left Column: Top -> Bottom
            for (int i = topRow; i <= bottomRow; i++) {

                if (totalMatrixElement < r * c) {
                    System.out.println(matrix[i][leftCol]);
                    totalMatrixElement++;
                }
            }

            leftCol++;

            // 2. Bottom Row: Left -> Right
            for (int j = leftCol; j <= rightCol; j++) {

                if (totalMatrixElement < r * c) {
                    System.out.println(matrix[bottomRow][j]);
                    totalMatrixElement++;
                }
            }

            bottomRow--;

            // 3. Right Column: Bottom -> Top
            for (int i = bottomRow; i >= topRow; i--) {

                if (totalMatrixElement < r * c) {
                    System.out.println(matrix[i][rightCol]);
                    totalMatrixElement++;
                }
            }

            rightCol--;

            // 4. Top Row: Right -> Left
            for (int j = rightCol; j >= leftCol; j--) {

                if (totalMatrixElement < r * c) {
                    System.out.println(matrix[topRow][j]);
                    totalMatrixElement++;
                }
            }

            // Move top boundary down
            topRow++;
        }
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

        System.out.println("Enter no. of rows and columns of matrix:");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter the " + (r * c) + " elements of matrix:");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix:");

        printMatrix(matrix);

        System.out.println("Anti-Clockwise Spiral Order:");

        AntiClockwiseOfspiralOrder(matrix, r, c);

        sc.close();
    }
}