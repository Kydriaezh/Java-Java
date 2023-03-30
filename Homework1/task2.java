package Homework1;
//. Задать целочисленный массив, состоящий из элементов 0 и 1.
// * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class task2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a == 1) {
                a = 0;
            } else {a = 1;
            }
        System.out.println(a);   
        }
    }


    

   
       
}    


