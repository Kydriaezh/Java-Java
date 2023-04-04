package Seminar3;

import java.util.ArrayList;
                                                                                                                        
public class practice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("string");
        list.add("string1");
        list.add("string2");

        for(String s: list){
            System.out.println(s);
        }



    }
// написать метод в котором нужно убрать дубликаты.
    public static void main(String[] args){
        List<Integer> integers = new ArrayList<>(Array.asList(1, 1,2,3,1,5,3,5,6,9));
        System.out.println(integers); 
        remiveDuplicates(integers);
        System.out.println(integers);

    }
    private static void removeDuplicates(List<Integer> source) {
        int i = 0;
        while (i<source.size()){
            int j = i+1;
            while (j, source.size()) {
                while (j, source.size()) {
                    if (source.get(i). equals(source.get(j))) {
                        source.remove(j);
                    }
                    j++;
                }
                i++;
            }

        }
    }
}


private static void removeDuplicates(List<Integer> source) {
    List<Integer> duplicates = new ArrayList<>();
    int i = 0;
    while (i<source.size()){
        Integer element = source.get(i);
        if(!duplicates.contains(element)) {
            duplicates.add(element);

        }else {
            source.remove(i--);
        }
        i++:
    }