class Vehicle{
    public void start(){
        System.out.println("Started");
    }
    public void stop(){
        System.out.println("Stopped");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike Stared");
    }
    public void stop(){
        System.out.println("Bike Stopped");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car Stared");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}
class Flight extends Vehicle{
    public void start(){
        System.out.println("Flight took off");
    }
    public void stop(){
        System.out.println("Flight landed");
    }
}
public class OverRideSample {
    public static void main(String[] args){
        System.out.println("Bike");
        Vehicle bv=new Bike();
        bv.start();
        bv.stop();
        System.out.println("Car");
        Vehicle cv=new Car();
        cv.start();
        cv.stop();
        System.out.println("Flight");
        Vehicle fv=new Flight();
        fv.start();
        fv.stop();
    }
}
