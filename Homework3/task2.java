package Homework3;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
        arr.add("string");
        arr.add("s");
        arr.add("5");
        arr.add("10");
        arr.add("-12");
        arr.add("my value");
        
        System.out.println(arr);
        delnumber(arr);
        System.out.println(arr);

    }
        static void delnumber(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            try {
                Integer.parseInt(arr.get(i));
                arr.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }
    }
}
