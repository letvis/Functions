package Lesson4;

public class DrawRect {

    public static void main(String[] args) {
        drawRect(3,2);
    }

    public static void drawRect(int w, int h) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                System.out.print("+  ");
            }
            System.out.println();
        }
    }
}