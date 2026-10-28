public class SharedRide extends Ride {
    private int passengerCount;

    public SharedRide(String rideId, double baseFare,
                      int passengerCount) {
        super(rideId, baseFare);

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: Invalid passenger count. Set to 1.");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }

    @Override
    public double calculateFare() {
        EconomyRide economyRide =
                new EconomyRide(rideId, baseFare, 0, 0);

        double wholeRideFare = economyRide.calculateFare();

        return (wholeRideFare / passengerCount) * 1.10;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Type: Shared"
                + ", Passenger Count: " + passengerCount
                + ", Fare Per Passenger: " + calculateFare() + " TL";
    }
}