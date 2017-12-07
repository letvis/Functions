package lesson5.practice;


public class Circle {
    private double radius;
    private Point centre;

    public Circle(double radius, Point centre) {
        this.radius = radius;
        this.centre = centre;
    }


    public boolean collisionCheck(Circle otherCircle) {

        if (radius + otherCircle.radius >= centre.calcLength(otherCircle.centre)) {
            return true;

        } else {
            return false;
        }
    }

}
