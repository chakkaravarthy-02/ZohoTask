package vehicle;

public class AirType extends Vehicle{
    public int seatCapacity;
    public String arrival;
    public String destination;

    public AirType(String brandName, int seatCapacity, String arrival, String destination) {
        super(brandName);
        this.seatCapacity = seatCapacity;
        this.arrival = arrival;
        this.destination = destination;
    }
}
