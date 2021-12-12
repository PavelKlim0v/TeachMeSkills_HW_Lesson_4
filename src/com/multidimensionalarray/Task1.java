package com.multidimensionalarray;

/**
 *  Задание 1.
 * 	  Шахматная доска. Создать программу для расскаски шахматной доски с помощю цикла.
 * 	  Создать двумерный массив String'ов 8х8.
 * 	  С помощью циклов задать элементам циклам значения B(Black) или W(White).
 * 	  Результат работы программы:   W  B  W  B  W  B  W  B
 * 	                                B  W  B  W  B  W  B  W
 * 	                                W  B  W  B  W  B  W  B
 * 	                                B  W  B  W  B  W  B  W
 * 	                                W  B  W  B  W  B  W  B
 * 	                                B  W  B  W  B  W  B  W
 * 	                                W  B  W  B  W  B  W  B
 * 	                                B  W  B  W  B  W  B  W
 */

public class Task1 {

    public static void main(String[] args) {

        String[][] array = new String[8][8];
        int a = 0;
        int b = 1;

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                if (a < b) {
                    a += 2;
                    array[x][y] = "W";
                    System.out.print(array[x][y] + "  ");
                } else if (a > b) {
                    b += 2;
                    array[x][y] = "B";
                    System.out.print(array[x][y] + "  ");
                }
            }
            if (a < b) {
                a += 2;
            } else if (a > b) {
                b += 2;
            }
            System.out.print("\n");
        }
    }
}
