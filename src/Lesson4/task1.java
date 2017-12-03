package Lesson4;

public class task1 {


    static String printNumbers(int n) {
        if (n <= 0) return "";
        String str = printNumbers(n - 1);
        return str + "\n" + n;
    }
    public static void main(String[] args) {
        String str = printNumbers(5);
        System.out.print(str);

    }
}
