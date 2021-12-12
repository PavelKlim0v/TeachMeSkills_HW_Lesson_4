package com.multidimensionalarray;

/**
 *  Задание 3.
 * 	  Создайте двумерный массив целых чисел.
 * 	  Выведите на консоль сумму всех элементов массива.
 */

public class Task3 {

    public static int sum;
    public static int result;

    public static void main(String[] args) {

        int[][] array = {{1,13,5,8},{3,10,17,2},{9,14,6,4}};
        for (int[] first : array) {
            int i = 0;
            for (int second : first) {
                if ((i > 0) && (i <= first.length)) {
                    sum = first[i] + (first[i - 1]);
                    first[i] = sum;
                }
                i++;
            }
            result = result + sum;
        }
        System.out.println(result);
    }
}
