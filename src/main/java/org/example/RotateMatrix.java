package org.example;

import java.util.Random;

public class RotateMatrix {

    public int[][] rotate(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }

    public void toString(int[][] matrix){
        for (int j = 0; j < matrix.length; j++) {
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

    public int[][] createRandomMatrix(int size){
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
        return matrix;
    }
    public int[][] createMatrix(int size){
        int s = 0;
        int[][] matrix = new int[size][size];
        for(int i= 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                s++;
                matrix[j][i] = s;
            }
        }
        return matrix;
    }
}
