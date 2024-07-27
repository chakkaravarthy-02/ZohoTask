package shape;

public class Circle extends Shape {
    public void area(double radius){
        double answer=Math.PI*Math.pow(radius,2);
        printArea(answer);
    }
}
