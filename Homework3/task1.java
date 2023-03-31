package Homework3;

import java.util.ArrayList;


public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(657);
        arr.add(234);
        arr.add(8);
        arr.add(9);
        System.out.println(arr);
        nechet(arr);
        System.out.println(arr);
    }
    static void nechet(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 > 0) {
                arr.remove(i);
                i--;
            }
} 
    }
}

