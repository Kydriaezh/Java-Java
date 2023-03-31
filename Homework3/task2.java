package Homework3;
// Дан список ArrayList<String> Удалить из него все строки, которые являются числами.

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
        list.add("string");
        list.add("s");
        list.add("5");
        list.add("10");
        list.add("-12");
        list.add("my value");
        
        System.out.println( list);
        delnumber(list);
        System.out.println(list);

    }
        static void delnumber(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }
    }
}
