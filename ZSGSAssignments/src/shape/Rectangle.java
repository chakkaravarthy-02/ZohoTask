package shape;

public class Rectangle extends Shape {
    public void area(double base,double height){
        double answer = 0.5 * base * height;
        printArea(answer);
    }
}
