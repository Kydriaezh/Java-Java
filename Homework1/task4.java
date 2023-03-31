
package Homework1;
// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//* и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//* Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//* * Также заполнить элементы побочной диагонали

import java.util.Arrays;

public class task4 {
    public static void main(String[] args){
        int[][] arr3 = quad(20);
        for (int[] is : arr3) {
            System.out.println(Arrays.toString(is));
        }
    }
            
        private static int[][] quad(int size) {
            int[][] arr = new int[size][size];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, z = arr[i].length - 1; j < arr[i].length; j++, z--) {
                    if (i == j || i == z)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
            return arr;
        }
            System.out.println();
    }
   
    
