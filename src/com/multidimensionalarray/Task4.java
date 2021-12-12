package com.multidimensionalarray;

/**
 *  Задание 4.
 * 	  Создайте двумерный массив. Выведите на консоль диагонали массива.
 */

public class Task4 {

    public static int result;
    public static int y;
    public static int x;

    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.print("Слева-направо, сверху-вниз: ");
        for (int y = 0; y < array.length; y++) {                     //слева-направо, сверху-вниз
            for (int x = 0; x < array[y].length; x++) {
                if (x == y) {
                    result += array[x][y];
                    System.out.print(array[x][y] + " ");
                }
            }
        }
        System.out.print("\nСправа-налево, сверху-вниз: ");
        for (int x = (array.length - 1); 0 <= x; x--) {              //справа-налево, сверху-вниз
            result += array[y][x];
            System.out.print(array[y][x] + " ");
            y++;
        }
        System.out.print("\nСнизу-вверх, справа-налево: ");
        for (int y = (array.length - 1); 0 <= y; y--) {              //снизу-вверх, справа-налево
            for (int x = (array[y].length - 1); 0 <= x; x--) {
                if (x == y) {
                    result += array[x][y];
                    System.out.print(array[x][y] + " ");
                }
            }
        }
        System.out.print("\nСнизу-вверх, слева-направо: ");
        for (int y = (array.length - 1); 0 <= y; y--) {              //снизу-вверх, слева-направо
            result += array[y][x];
            System.out.print(array[y][x] + " ");
            x++;
        }
    }
}
