package vehicle;

public class RoadType extends Vehicle{
    public int tireCount;
    public int tankCapacity;
    public int mileage;

    public RoadType(int tireCount, String brandName, int tankCapacity, int mileage) {
        super(brandName);
        this.tireCount = tireCount;
        this.brandName = brandName;
        this.tankCapacity = tankCapacity;
        this.mileage = mileage;
    }
}
