package vehicle;

public class WaterType extends Vehicle{
    public String model;
    public String type;
    public String arrival;
    public String destination;

    public WaterType(String brandName, String model, String type, String arrival, String destination) {
        super(brandName);
        this.model = model;
        this.type = type;
        this.arrival = arrival;
        this.destination = destination;
    }
}
