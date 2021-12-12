package com.multidimensionalarray;

/**
 *  Задание 5.
 * 	  Создайте двумерный массив целых чисел.
 * 	  Отсортируйте элементы в строках двумерного массива по возрастанию.
 */

public class Task5 {

    public static void main(String[] args) {

        int[][] array = {{1,13,5,8},{3,10,17,2},{9,14,6,4}};
        int count;
        do {
            count = 0;
            for(int y = 0; y < array.length; y++) {
                for (int x = 0; x < array[y].length - 1; ++x) {
                    if (array[y][x] > array[y][x + 1]) {
                        int temp = array[y][x];
                        array[y][x] = array[y][x + 1];
                        array[y][x + 1] = temp;
                        ++count;
                    }
                }
            }
        } while(count > 0);

        for (int y = 0; y < array.length; ++y) {
            if (y > 0) {
                System.out.print("\n");
            }
            for (int x = 0; x < array[y].length; ++x) {
                System.out.print(array[y][x] + "  ");
            }
        }
    }
}
