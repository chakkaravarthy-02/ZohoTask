public class FlightDTO {
    public String flightName;
    public int flightNo;
    public String arrival;
    public String destination;

    public FlightDTO(String flightName, int flightNo, String arrival, String destination) {
        this.flightName = flightName;
        this.flightNo = flightNo;
        this.arrival = arrival;
        this.destination = destination;
    }

    public String showFlightDetails() {
        return "flightName : " + flightName + "\nflightNo : " + flightNo + "\narrival : " + arrival + "\ndestination : " + destination;
    }
}

class FlightMain{
    public static void main(String[] args) {
        FlightDTO flightDTO=new FlightDTO("AirIndia",9099,"India","Mars");
        System.out.println(flightDTO.showFlightDetails());
    }
}
