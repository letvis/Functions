package Lesson4;

public class DrawRect {


    public static void main(String[] args) {
        int n = 2;
        int m = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(inRectangle(i, j, n, m)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static boolean inRectangle(int i, int j, int n, int m) {
        return i == 0 || i == n - 1 || j == 0 || j == m - 1;
    }
}