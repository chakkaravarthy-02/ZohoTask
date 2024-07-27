package vehicle;

public class Vehicle {
    public String brandName;

    public Vehicle(String brandName){
        this.brandName=brandName;
    }

    public void start(){
        System.out.println("started...");
    }
    public void stop(){
        System.out.println("stopped");
    }
}
