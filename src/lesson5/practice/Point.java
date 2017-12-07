package lesson5.practice;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcLength(Point otherPoint) {

        double x1 = this.x;
        System.out.println("x= " + x);
        double x2 = otherPoint.x;
        System.out.println("otherPoint.x= " + otherPoint.x );
        double y1 = this.y;
        System.out.println("y= " + y);
        double y2 = otherPoint.y;
        System.out.println("otherPoint.y= " + otherPoint.y);
        double a = x2 - x1;
        double b = y2 - y1;
        double c = a * a + b * b;
        double f = Math.sqrt(c);
        return f;


    }


}
