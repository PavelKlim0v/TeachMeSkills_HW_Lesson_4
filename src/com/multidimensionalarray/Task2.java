package com.multidimensionalarray;

/**
 *  Задание 2.
 * 	  Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы).
 * 	  Напишите программу для умножения двух матриц.
 * 	  первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * 	  втрой массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * 	  Ожидаемый результат:  1  2  3
 * 	                        1  1  1
 * 	                        0  0  0
 */

public class Task2 {

    public static void main(String[] args) {        //для меня это было самое сложное задание

        int[][] firstArray = {{1,0,2},{1,0,0},{0,1,0}};
        int[][] secondArray = {{0,0,1},{0,2,1},{1,0,0}};
        int[][] thirdArray = new int[3][3];

        for (int i = 0; i < firstArray.length; i++) {
            for (int y = 0; y < firstArray.length; y++) {
                int value = 0;
                for (int x = 0; x < secondArray.length; x++) {
                    value += firstArray[i][x] * secondArray[x][y];
                }
                thirdArray[i][y] = value;
                System.out.print(thirdArray[i][y] + " ");
            }
            System.out.print("\n");
        }

//        int[][] firstArray = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
//        int[][] secondArray = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
//        int[][] thirdArray = new int[3][3];
//
//        for (int i = 0; i < firstArray.length; i++) {
//            for (int j = 0; j < firstArray.length; j++) {
//                int value = 0;
//                for (int k = 0; k < secondArray.length; k++) {
//                    value += firstArray[i][k] * secondArray[k][j];
//                }
//                thirdArray[i][j] = value;
//                System.out.print(thirdArray[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
    }
}