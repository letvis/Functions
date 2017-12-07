package lesson5.practice;

public class Main {


    public static void main(String[] args) {

        Point p1 = new  Point(20,0);
        Point p2 = new Point(3,0);
        double a = p1.calcLength(p2);
        System.out.println(a);

        Circle c1 = new Circle(2,p1);
        Circle c2 = new Circle(3,p2);
         boolean d = c1.collisionCheck(c2);
        System.out.println(d);



    }
}
