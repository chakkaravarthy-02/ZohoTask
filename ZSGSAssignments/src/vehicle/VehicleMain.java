package vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        AirType airType=new AirType("AirIndia",100,"India","America");
        RoadType roadType=new RoadType(4,"Audi",45,9);
        WaterType waterType=new WaterType("Sea Ray","yacht","passenger","america","india");

        airType.start();
        roadType.start();
        waterType.start();

        roadType.stop();
    }
}
