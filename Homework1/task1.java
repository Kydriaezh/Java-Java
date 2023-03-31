package Homework1;

public class task1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2018)); // true
        System.out.println(isLeapYear(1936)); // false
    
        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3]; 
    
    
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        return 10 <= a + b && a + b <= 20; 
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x > 0;
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        System.out.println(source.repeat(repeat));
    }
    
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        
    }
    
    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        return null;
    }
    
   
    
}
