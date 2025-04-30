package com.java.progarm100;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 9, 7},
            {4, 5, 6},
            {3, 8, 9}
        };
        
        int[][] matrix2 = {
            {1, 8, 7},
            {6, 0, 3},
            {3, 5, 1}
        };

        int[][] result = new int[3][3];

      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

      
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

