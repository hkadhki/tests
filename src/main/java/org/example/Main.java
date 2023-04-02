package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
        toString(matrix);
        System.out.println();

        int degrees;
        System.out.println("На сколько градусов повернуть?");
        degrees = scanner.nextInt();
        for (int i = 0; i < (degrees / 90); i++){
            matrix = rotate(matrix);
        }

        toString(matrix);

    }

    public static int[][] rotate(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                rotatedMatrix[i][j] = matrix[SIZE - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }

    public static void toString(int[][] matrix){
        for (int j = 0; j < SIZE; j++) {
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}


