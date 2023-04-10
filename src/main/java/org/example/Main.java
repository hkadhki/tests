package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] matrix = rotateMatrix.createRandomMatrix(SIZE);
        Scanner scanner = new Scanner(System.in);

        rotateMatrix.toString(matrix);
        System.out.println();

        int degrees;
        System.out.println("На сколько градусов повернуть?");
        degrees = scanner.nextInt();
        for (int i = 0; i < (degrees / 90); i++){
            matrix = rotateMatrix.rotate(matrix);
        }

        rotateMatrix.toString(matrix);

    }
}


