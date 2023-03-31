package Homework3;
// Дан список ArrayList<Integer> целых чисел. Удалить из него нечётные числа
import java.util.ArrayList;


public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        nechet(list);
        System.out.println(list);
    }
    static void nechet(ArrayList<Integer>  list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 > 0) {
                list.remove(i);
                i--;
            }
} 
    }
}

