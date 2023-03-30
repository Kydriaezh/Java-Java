package Seminar2;

public class practice {
    public static void main(String[] args){
        String s = "aaaabbbbcddd";
        String compressed = compress(s);
        System.out.println(compressed);
}
  
// написать метод, который сжимает строку aaaabbbbcddd до вида а4b4cd3
static String compress(String input){
    String result = "";
    int count = 1;
    char tmp = input.charAt(0);
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (tmp == c) {
            count++;
        } else {
            if (count > 1) {
                result += tmp; 
                result += count;
            } else {
                result += tmp;
            }
            tmp = c;
            count = 1;
        }
    }
    result += tmp;
    result += count;
    return result;


}
}