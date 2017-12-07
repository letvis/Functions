package Lesson4;


public class reloadDrawRect {
    public static void drawRect(int w, int h) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                System.out.print("+  ");
            }
            System.out.println();
        }
    }
    public static void drawRect(int h) {
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < h; y++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawRect(4);
    }
}