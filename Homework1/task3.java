package Homework1;
// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class task3 {
    public static void main(String[] args) {
    int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    
    for (int i = 0; i < array.length; i++) {
        int a = array[i];
        if (a < 6) {
        a = a*2;
    }
    System.out.println(a);   
}
}
}