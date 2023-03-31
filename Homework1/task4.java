
package Homework1;
// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//* и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//* Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//* * Также заполнить элементы побочной диагонали

import java.util.Random;

public class task4 {
   
     {
       
        int[][] array = new int [4][4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j=0; i < array.length; i++) {
                array[i][j] = random.nextInt(10);
            }
        }     
            
            for (int i = 0; i < array.length; i++) {
            for (int j=0; i < array.length; i++) {       
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
    }
   
    
}
    }
