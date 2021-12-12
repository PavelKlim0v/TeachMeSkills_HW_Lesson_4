package com.multidimensionalarray;

import java.util.Scanner;

/**
 *  Задание 0.
 *    Создать трехмерный массив из целых чисел
 *    С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 * 	  Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */

public class Task0 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int x = 0, y = 0, z = 0;
        int sum;
        int[][][] array = {      {  {1, 2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}  }, {  {9, 8, 7},
                                                     {6, 5, 4},
                                                     {3, 2, 1}  }, {  {10, 20, 30},
                                                                      {40, 50, 60},
                                                                      {70, 80, 90}  }      };
        for (int[][] first : array) {
            for (int[] second : first) {
                for (int third : second) {
                    sum = third + num;
                    array[z][y][x] = sum;
                    System.out.print(sum + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
